package Imagenes;

import java.io.File;
import java.io.Serializable;

public class Imagen implements Serializable {

    private String nombre;
    private File file;

    public Imagen(String nombre, File file) {
        this.nombre = nombre;
        this.file = file;
    }

    public Imagen(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
