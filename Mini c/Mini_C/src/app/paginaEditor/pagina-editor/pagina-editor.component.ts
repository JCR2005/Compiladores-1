  import { Component } from '@angular/core';
  import { ProyectoService } from '../../Services/sevicio-obtenerProyecto/proyecto.service';
  import { CommonModule } from '@angular/common';
  import { OnInit } from '@angular/core';
  import { PanelArchivosComponent } from '../panel-archivos/panel-archivos.component';

  @Component({
    selector: 'app-pagina-editor',
    standalone: true,
    imports: [CommonModule,PanelArchivosComponent],
    templateUrl: './pagina-editor.component.html',
    styleUrl: './pagina-editor.component.css'
  })
  export class PaginaEditorComponent implements OnInit {
    carpetaRuta: FileSystemDirectoryHandle | null = null;
    carpeta: string=""; 
    
    cargando: boolean = false;
    constructor(private proyectoService: ProyectoService) {}

    async ngOnInit(): Promise<void> {
      this.cargando = true;
    
      const handle = await this.proyectoService.inicializarCarpeta();
      if (handle) {
       
        this.carpetaRuta=handle;
        this.carpeta = handle.name;
        console.log('Carpeta disponible:', handle.name);
      }
    
     
      setTimeout(() => {
        this.cargando = false;
      }, 1000); 
    }
    
  }
