import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { analizador } from '../../parser/analizador';


interface MiEntrada {
  nombre: string;
  id:number;
  handle: FileSystemHandle;
}


@Component({
  selector: 'app-panel-archivos',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './panel-archivos.component.html',
  styleUrl: './panel-archivos.component.css'
})


export class PanelArchivosComponent  {



  @Input() carpeta!: FileSystemDirectoryHandle;
  contador:number=0;

  directorioActual!: FileSystemDirectoryHandle;
  archivoActual!: FileSystemFileHandle;

  contenidoAntesDeGuardar:string="";
  contenido:string="";
  nombreArchivo:string="";

  panelCrearModulo: boolean=false;
  panelCrearArchivo: boolean=false;
  canbios:boolean=false;

  lineas: number[] = [1];

  nombreArchivoACrear:string="";
  nombreModuloCrear:string="";

  entradasPricipales:FileSystemHandle[]=[];
  entradasSecundarias: MiEntrada[][] = [];


  ngOnInit(): void {
    
    this.obtenerDatosDirectirioPrincipal();
  }

  
  async obtenerDatosDirectirioPrincipal(){

    for await (const entry of this.carpeta.values()) {
      this.entradasPricipales.push(entry);
      console.log(entry.kind, entry.name);
    }
    this.obetenerDatosSecundarios();
  }

  async analizarCodigo(){

    
    alert(await analizador.parse(this.contenido));
  }
  async obetenerDatosSecundarios(){
    console.log("______________________________________");
    for await (const entry of this.entradasPricipales){

      console.log(entry.kind, entry.name);
      await this.obtenerArchivos(entry);
    }
    console.log("______________________________________");
    
  }

async obtenerArchivos(entry:FileSystemHandle){


    if(entry.kind==="directory"){
      const directorio= entry as FileSystemDirectoryHandle;
      console.log("archivos"+ entry.name);
      const archivo: MiEntrada[]=[];
      for await (const e of directorio.values()){

        if(e.kind==="file"){
          const nuevaEntrada: MiEntrada = {
            nombre: e.name,
            id: this.contador++,
            handle: e
          };
          archivo.push(nuevaEntrada);
          console.log(e.kind, e.name);
        }
        
      }
      this.entradasSecundarias.push(archivo);
      console.log(":::::::"); 
    }
    for (let i = 0; i < this.entradasSecundarias.length; i++) {
      console.log(`Grupo ${i + 1}:`);
      
      for (let entrada of this.entradasSecundarias[i]) {
        console.log(`→ ${entrada.nombre} (ID: ${entrada.id})`);
      }
    
      console.log('-------------------------');
    }
    
}


async abrirArchivo(handle:FileSystemHandle){
  this.verificarCambios();
  if(this.canbios===true){
    alert("guarde los cambio hechos en →"+this.archivoActual.name+"←") ;
    return;
  }
  const file= handle as FileSystemFileHandle;
  const contents = await file.getFile();
  this.contenido=await contents.text();
  this.contenidoAntesDeGuardar=await contents.text();
  this.archivoActual=handle as FileSystemFileHandle;
  this.actualizarLineas();
}
archivoTieneMain(): boolean {
  if (!this.archivoActual || !this.contenido) return false;
  const regex = /void\s+main\s*\(\s*\)\s*\{/;
  return regex.test(this.contenido);
}

async guardarCambiosArchivo(){
  await this.analizarCodigo();
  alert("werth");
  const writable = await this.archivoActual.createWritable();
  await writable.write(this.contenido);
  await writable.close();
  this.canbios=false;
  this.contenidoAntesDeGuardar=this.contenido;
 


}

 
eliminarArchivos(handle: FileSystemHandle){
  this.eliminarArchivo(handle);
  window.location.reload();

}
async eliminarArchivo(handle: FileSystemHandle) {
  const file = handle as FileSystemFileHandle;

  if ('remove' in file && typeof file.remove === 'function') {
    await file.remove();
  } else {
    console.warn('El método remove() no está disponible en este navegador.');
  }
 

}
eliminarModulos(handle: FileSystemHandle){
  this.eliminarModulo(handle);
  window.location.reload();

}
async eliminarModulo(handle: FileSystemHandle) {

  const directory = handle as FileSystemDirectoryHandle;

  for await(const entry of directory.values()){
      if(entry.kind==="file"){

          await this.eliminarArchivo(entry);
      }
       if(entry.kind==="directory"){

         await this.eliminarModulo(entry);
      }

  }

  if ('remove' in directory && typeof directory.remove === 'function') {
    await directory.remove();
  } else {
    alert('El método remove() no está disponible en este navegador.');
  }

}


verificarCambios() {
  this.canbios = this.contenido !== this.contenidoAntesDeGuardar;
}

manejarTab(event: KeyboardEvent) {
  if (event.key === 'Tab') {
    event.preventDefault();

    const textarea = event.target as HTMLTextAreaElement;
    const start = textarea.selectionStart;
    const end = textarea.selectionEnd;
    this.contenido =
      this.contenido.substring(0, start) + '\t' + this.contenido.substring(end);
    setTimeout(() => {
      textarea.selectionStart = textarea.selectionEnd = start + 1;
    });
  }
}

manejarCtrlS(event: KeyboardEvent) {
  if (event.ctrlKey && event.key === 's') {
    event.preventDefault();
    this.guardarCambiosArchivo();

  }
}

  actualizarLineas() {
    const cantidadLineas = this.contenido.split('\n').length;
    this.lineas = Array.from({ length: cantidadLineas }, (_, i) => i + 1);
  }



  cerrarPanelCrearModulo(){
    this.panelCrearModulo =false;
  }

  abrirPanelCrearModulo(){
 
    this.panelCrearModulo=true;
  }



  cerrarPanelCrearArchivo(){
    this.panelCrearArchivo =false;
  }

  abrirPanelCrearArchivo(directorio:FileSystemHandle){
     this.directorioActual= directorio as FileSystemDirectoryHandle;
    this.panelCrearArchivo=true;
  }


  async crearModulo(){

    if (!this.nombreModuloCrear || this.nombreModuloCrear.trim() === '') {
      alert('Su proyecto debe tener algún nombre.\nIngrese un nombre por favor.');
      return;
    }

    try {
      await this.carpeta.getDirectoryHandle(this.nombreModuloCrear);
      this.nombreModuloCrear="";
      alert('ya existe un modulo con ese nombre. Ingrese otro nombre.');
      return;
    } catch {

      await this.carpeta.getDirectoryHandle(this.nombreModuloCrear, {
        create: true,
      });
      this.nombreModuloCrear="";
      window.location.reload();
    }
   
  }

  async crearArchivo(){
    
    if (!this.nombreArchivoACrear || this.nombreArchivoACrear.trim() === '') {
      alert('Su proyecto debe tener algún nombre.\nIngrese un nombre por favor.');
      return;
    }
    try {
     
      await this.directorioActual.getDirectoryHandle(this.nombreArchivoACrear+'.cmm');
      this.nombreArchivoACrear="";
      alert('ya existe un .cmm con ese nombre. Ingrese otro nombre.');
      return;
    } catch {

      await this.directorioActual.getFileHandle(this.nombreArchivoACrear+'.cmm', {
        create: true,
      });
      this.nombreArchivoACrear="";
      window.location.reload();
    }
   
  }


}
