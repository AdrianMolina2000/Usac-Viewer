package Convertidor;

import Categorias.Categoria;
import ClasesProporcionadas.EstructuraDeDatos;

public class ColaSimple extends EstructuraDeDatos {

    NodoSimple primero;
    NodoSimple ultimo;
    int tamanio;

    public ColaSimple() {
        primero = null;
        ultimo = null;
        tamanio = 0;
    }

    @Override
    public void add(Object e) {
        NodoSimple aux = new NodoSimple((Categoria) e, null);

        if (this.getSize() == 0) {
            primero = aux;
            ultimo = aux;
        } else {
            if (this.getSize() == 1) {
                primero.setSiguiente(aux);
            } else {
                ultimo.setSiguiente(aux);
            }
            ultimo = aux;
        }

        tamanio++;
    }

    //  Retira el primer elemento de la cola
    @Override
    public Object pop() {
        if (this.getSize() == 0) {
            return null;
        }
        Categoria categoria = primero.getDato();
        NodoSimple aux = primero.getSiguiente();
        primero = null;

        primero = aux;
        tamanio--;
        if (this.getSize() == 0) {
            ultimo = null;
        }
        return categoria;
    }

    //  Retira el ultimo elemento de la cola
    @Override
    public Object peek() {
        if (getSize() == 0) {
            return null;
        }
        Categoria categoria = ultimo.getDato();
        if (this.primero == this.ultimo) {
            this.primero = this.ultimo = null;
        } else {
            NodoSimple actual = this.primero;
            while (actual.getSiguiente() != this.ultimo) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
            this.ultimo = actual;
        }
        tamanio--;
        return categoria;

    }

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize() {
        return tamanio;
    }

 
    @Override
    public Object get(int referencia) {
        NodoSimple aux = primero;
        for (int i = 0; i < referencia; i++) {
            aux = aux.getSiguiente();
        }
        return aux.getDato();
    }


    @Override
    public String toString() {
        if (this.getSize() == 0) {
            return "La lista esta vacia";
        } else {

            String cadena = "";
            NodoSimple aux = primero;
            while (aux != null) {
                cadena += aux.getDato().getNombreCategoria();
                aux = aux.getSiguiente();
            }
            return cadena;
        }
    }

    @Override
    public void delete(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
