package Categorias;

import ClasesProporcionadas.EstructuraDeDatos;

public class ListaDoble extends EstructuraDeDatos {

    private NodoListaDoble primero,ultimo;
    private int tamanio = 0;

    public ListaDoble() {
        primero = ultimo = null;
    }

    @Override
    public void add(Object e) {

        NodoListaDoble aux = new NodoListaDoble((Categoria) e);
        if (primero == null) {
            primero = aux;
        } else {
            aux.setSiguiente(primero);
            primero.setAnterior(aux);
            primero = aux;
        }
        tamanio++;

    }

    @Override
    public void delete(Object e) {
        if (primero != null) {
            NodoListaDoble aux = primero;
            NodoListaDoble ant = null;
            Categoria categoriax = (Categoria) e;
            while (aux != null) {
                if (aux.getCategoria().getNombreCategoria().equals(categoriax.getNombreCategoria())) {
                    if (ant == null) {
                        primero = primero.getSiguiente();
                        aux.setSiguiente(null);
                        aux = primero;

                    } else {
                        ant.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(null);
                        aux = ant.getSiguiente();
                    }
                } else {
                    ant = aux;
                    aux = aux.getSiguiente();
                }
            }
        }
        tamanio--;
    }

    @Override
    public Object find(Object e) {
        String referencia = (String) e;
        NodoListaDoble aux = primero;
        boolean existe = false;
        while (existe != true && aux != null) {
            if (referencia.equals(aux.getCategoria().getNombreCategoria())) {
                existe = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return existe;
    }

    @Override
    public int getSize() {
        return tamanio;
    }

    @Override
    public Object get(int referencia) {
        NodoListaDoble aux = primero;
        for (int i = 0; i < referencia; i++) {
            aux = aux.getSiguiente();
        }
        return aux.getCategoria();
    }

    @Override
    public Object pop() {
        if (primero == null) {
            return null;
        }
        Categoria usu = primero.getCategoria();
        primero = primero.getSiguiente();
        tamanio--;
        return usu;
    }

    @Override
    public Object peek() {
        return primero.getCategoria();
    }

    @Override
    public Object getNext() {
        return primero.getSiguiente().getCategoria();
    }

    public void modificarNodo(Categoria categoria) {
        NodoListaDoble aux = this.primero;
        while (aux != null) {
            if (aux.getCategoria().getNombreCategoria().equals(categoria.getNombreCategoria())) {
                aux.setCategoria(categoria);
            }
            aux = aux.getSiguiente();
        }
    }

    /*
    public boolean esVacia() {
        return inicio == null;
    }
    
    public void imprimirInicioFin() {
        if (!esVacia()) {
            NodoListaDoble aux = inicio;
            while (aux != null) {
                System.out.println(aux.getCategoria().getNombreCategoria());
                aux = aux.siguiente;
            }
        }
    }

    public void imprimirFinInicio() {
        if (!esVacia()) {
            NodoListaDoble aux = inicio;
            while (aux != null) {
                System.out.println(aux.getCategoria().getNombreCategoria());
                aux = aux.anterior;
            }
        }
    }
     */
}
