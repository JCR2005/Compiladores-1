import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { ProyectoService } from '../../Services/sevicio-obtenerProyecto/proyecto.service';

@Component({
 
  selector: 'app-pagina-principal',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './pagina-principal.component.html',
  styleUrl: './pagina-principal.component.css'
})
export class PaginaPrincipalComponent {

  constructor(private router: Router,private obternerProyecto: ProyectoService) {}


   nombreProyecto: string = '';
   panelCrear: boolean=false;


   async crearProyecto() {
    if (!this.nombreProyecto || this.nombreProyecto.trim() === '') {
      alert('Su proyecto debe tener algún nombre.\nIngrese un nombre por favor.');
      return;
    }
  
    try {
      const carpetaHandle = await (window as any).showDirectoryPicker();
  
      try {
        await carpetaHandle.getDirectoryHandle(this.nombreProyecto);
        this.nombreProyecto="";
        alert('Ese proyecto ya existe. Ingrese otro nombre.');
        return;
      } catch {
     
        const subcarpetaHandle = await carpetaHandle.getDirectoryHandle(this.nombreProyecto, { create: true });
        const archivoHandle = await subcarpetaHandle.getFileHandle('configuración.yml', { create: true });
        const writable = await archivoHandle.createWritable();
  
        const contenido = `# Definición del proyecto\nnombre_proyecto: "${this.nombreProyecto}"`;
  
        await writable.write(contenido);
        await writable.close();
  
        alert('Proyecto creado con éxito.');
        this.obternerProyecto.setCarpetaHandle(subcarpetaHandle);
        this.panelCrear=false;
        this.router.navigate(["/paginaEditor"]);
      }
  
    } catch (error) {
      console.error('Error al crear el proyecto:', error);
      alert('Ocurrió un error al crear el proyecto. Inténtelo de nuevo.');
    }
  }
  
  
  async abrirProyecto() {
    try {
      const carpetaHandle = await (window as any).showDirectoryPicker();

        alert('Proyecto abierto con éxito.');
        this.obternerProyecto.setCarpetaHandle(carpetaHandle);
        this.router.navigate(["/paginaEditor"]);
    } catch (error) {
      console.error('Error al crear el proyecto:', error);
      alert('Ocurrió un error al crear el proyecto. Inténtelo de nuevo.');
    }
  }


  cerrarPanelCrear(){
    this.panelCrear=false;
  }

  abrirPanelCrear(){
    this.nombreProyecto="";
    this.panelCrear=true;
  }
}
