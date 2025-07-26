
import { Injectable } from '@angular/core';
import { get, set } from 'idb-keyval';

@Injectable({
  providedIn: 'root'
})
export class ProyectoService {
  carpetaHandle: FileSystemDirectoryHandle | null = null;

  constructor() {}

  async inicializarCarpeta(): Promise<FileSystemDirectoryHandle | null> {
    const handle = await get('carpetaHandle');

    if (handle && await this.verificarPermisos(handle)) {
      this.carpetaHandle = handle;
      return handle;
    } else {
      return null;
    }
  }

  async setCarpetaHandle(handle: FileSystemDirectoryHandle) {
    this.carpetaHandle = handle;
    await set('carpetaHandle', handle);
  }

  async verificarPermisos(handle: FileSystemDirectoryHandle): Promise<boolean> {
    const permiso = await (handle as any).queryPermission({ mode: 'readwrite' });
if (permiso === 'granted') return true;

const nuevoPermiso = await (handle as any).requestPermission({ mode: 'readwrite' });
return nuevoPermiso === 'granted';
  }
}
