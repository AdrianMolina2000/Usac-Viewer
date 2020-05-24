package Usuarios;

import java.io.Serializable;

public class NodoListaSimple implements Serializable{
    private Usuario usuario;
    private NodoListaSimple siguiente;

    public NodoListaSimple(Usuario usuario) {
        this.usuario = usuario;
        this.siguiente = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario nombre) {
        this.usuario = nombre;
    }

    public NodoListaSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimple siguiente) {
        this.siguiente = siguiente;
    }

    

}
