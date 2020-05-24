package Imagenes;

import ClasesProporcionadas.EstructuraDeDatos;

public class ListaCircular extends EstructuraDeDatos {

    int tamanio = 0;
    NodoListaCircular primero, ultimo;

    public ListaCircular() {
        primero = null;
        ultimo = null;
    }

    @Override
    public void add(Object e) {
        NodoListaCircular nuevo = new NodoListaCircular((Imagen) e);
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
        tamanio++;
    }

    @Override
    public void delete(Object e
    ) {
        Imagen imagen = (Imagen) e;
        NodoListaCircular actual = primero;
        NodoListaCircular anterior = ultimo;
        do {
            if (imagen.getNombre().equals(actual.getImagen().getNombre())) {
                if (actual == primero) {
                    primero = primero.siguiente;
                    ultimo.siguiente = primero;
                    primero.anterior = ultimo;
                } else if (actual == ultimo) {
                    ultimo = anterior;
                    primero.anterior = ultimo;
                    ultimo.siguiente = primero;
                } else {
                    anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = anterior;
                }
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != primero);
        tamanio--;
    }

    @Override
    public Object find(Object e) {
        String nombreImagen = (String) e;
        NodoListaCircular actual = primero;
        boolean existe = false;
        do {
            if (actual.getImagen().getNombre().equals(nombreImagen)) {
                existe = true;
            }
            actual = actual.siguiente;
        } while (actual != primero);
        return existe;
    }

    @Override
    public int getSize() {
        return tamanio;
    }

    @Override
    public Object get(int referencia) {
        NodoListaCircular aux = primero;
        for (int i = 0; i < referencia; i++) {
            aux = aux.getSiguiente();
        }
        return aux.getImagen();
    }

    public Imagen getNext(Imagen imagen) {
        NodoListaCircular actual = primero;
        Imagen imagenAux = imagen;
        do {
            if (actual.getImagen().getNombre().equals(imagen.getNombre())) {
                imagenAux = actual.siguiente.getImagen();
            }
            actual = actual.siguiente;
        } while (actual != primero);
        return imagenAux;
    }

    public Imagen getPrevious(Imagen imagen) {
        NodoListaCircular actual = primero;
        Imagen imagenAux = imagen;
        do {
            if (actual.getImagen().getNombre().equals(imagen.getNombre())) {
                imagenAux = actual.anterior.getImagen();
            }
            actual = actual.siguiente;
        } while (actual != primero);
        return imagenAux;
    }

    public int DevolverNumeroNodo(String nombre) {
        int numeroNodo = 0;
        NodoListaCircular actual = primero;
        do {
            if (actual.getImagen().getNombre().equals(nombre)) {
                return numeroNodo;
            }
            actual = actual.siguiente;
            numeroNodo++;
        } while (actual != primero);
        return numeroNodo;
    }

    public void modificar(Imagen imagen) {
        NodoListaCircular actual = primero;
        do {
            if (imagen.getNombre().equals(actual.getImagen().getNombre())) {
                actual.setImagen(imagen);
            }
            actual = actual.siguiente;
        } while (actual != primero);
    }

    @Override
    public Object pop() {
        if (primero == null) {
            return null;
        }
        Imagen usu = primero.getImagen();
        primero = primero.getSiguiente();
        tamanio--;
        return usu;
    }

    @Override
    public Object peek() {
        return primero.getImagen();
    }

    @Override
    public Object getNext() {
        return primero.getSiguiente().getImagen();
    }

    public void imprimir() {
        NodoListaCircular actual = primero;
        do {
            System.out.println(actual.getImagen().getNombre());
            actual = actual.siguiente;
        } while (actual != primero);
    }

}
