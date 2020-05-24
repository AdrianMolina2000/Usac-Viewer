
package Imagenes;

import java.io.Serializable;

public class NodoListaCircular implements Serializable{
    private Imagen imagen;
    NodoListaCircular siguiente, anterior;
    
    public NodoListaCircular(Imagen imagen){
        this.imagen = imagen;
        siguiente = null;
        anterior = null;
    }

    public NodoListaCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCircular siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaCircular getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaCircular anterior) {
        this.anterior = anterior;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }
}
