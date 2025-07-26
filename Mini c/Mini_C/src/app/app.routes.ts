import { Routes } from '@angular/router';


import { PaginaPrincipalComponent } from './paginaPrincipal/pagina-principal/pagina-principal.component';
import { PaginaEditorComponent } from './paginaEditor/pagina-editor/pagina-editor.component';


export const routes: Routes = [


    { path: 'paginaEditor', component: PaginaEditorComponent },
    { path: 'paginaPrincipal', component: PaginaPrincipalComponent },
    { path: '', redirectTo: '/paginaPrincipal', pathMatch: 'full' },
];
