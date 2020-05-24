package Usuarios;

import Categorias.ListaDoble;
import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre;
    private ListaDoble listaCategorias;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public ListaDoble getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ListaDoble listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
