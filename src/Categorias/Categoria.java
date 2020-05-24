package Categorias;

import Imagenes.ListaCircular;
import java.io.Serializable;

public class Categoria implements Serializable {

    private String nombreCategoria;
    private ListaCircular listaImagenes;

    public Categoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public ListaCircular getListaImagenes() {
        return listaImagenes;
    }

    public void setListaImagenes(ListaCircular listaImagenes) {
        this.listaImagenes = listaImagenes;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

}
