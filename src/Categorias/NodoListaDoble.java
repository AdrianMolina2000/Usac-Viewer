package Categorias;

import java.io.Serializable;



public class NodoListaDoble implements Serializable{
    Categoria categoria;
    NodoListaDoble anterior,siguiente;

    public NodoListaDoble(Categoria categoria) {
        this(categoria,null,null);
    }
    
    public NodoListaDoble(Categoria categoria, 
            NodoListaDoble anterior, NodoListaDoble siguiente) {
        this.categoria = categoria;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public NodoListaDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDoble anterior) {
        this.anterior = anterior;
    }

    public NodoListaDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDoble siguiente) {
        this.siguiente = siguiente;
    }
    
}
