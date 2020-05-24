package Usuarios;

import ClasesProporcionadas.EstructuraDeDatos;

public class ListaSimple extends EstructuraDeDatos{

    public NodoListaSimple primero;
    int tamanio = 0;

    public ListaSimple() {
        primero = null;
    }

    @Override
    public void add(Object e) {

        Usuario nuevo = (Usuario) e;
        NodoListaSimple nuevoNodo = new NodoListaSimple(nuevo);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            NodoListaSimple nodoAux = primero;
            while (nodoAux.getSiguiente() != null) {
                nodoAux = nodoAux.getSiguiente();
            }
            nodoAux.setSiguiente(nuevoNodo);
        }
        tamanio++;

    }

    @Override
    public int getSize() {
        return tamanio;
    }

    @Override
    public Object get(int referencia) {
        NodoListaSimple aux = primero;
        for (int i = 0; i < referencia; i++) {
            aux = aux.getSiguiente();
        }
        return aux.getUsuario();

    }

    @Override
    public Object find(Object e) {
        String nombreUsuario = (String) e;
        NodoListaSimple aux = primero;
        boolean existe = false;
        while (existe != true && aux != null) {
            if (nombreUsuario.equals(aux.getUsuario().getNombre())) {
                existe = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return existe;
    }
    
    @Override
    public Object peek() {
        return primero.getUsuario();
    }

    @Override
    public Object pop() {
        if (primero == null) {
            return null;
        }
        Usuario usu = primero.getUsuario();
        primero = primero.getSiguiente();
        tamanio--;
        return usu;
    }

    @Override
    public void delete(Object e) {
        if (primero != null) {
            NodoListaSimple aux = primero;
            NodoListaSimple ant = null;
            Usuario categoriax = (Usuario) e;
            while (aux != null) {
                if (aux.getUsuario().getNombre().equals(categoriax.getNombre())) {
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
    public Object getNext() {
        return primero.getSiguiente().getUsuario();
    }

    public void modificarNodo(Usuario usuario) {
        NodoListaSimple aux = primero;
        while (aux != null) {
            if (aux.getUsuario().getNombre().equals(usuario.getNombre())) {
                aux.setUsuario(usuario);
            }
            aux = aux.getSiguiente();
        }
    }

    public void imprimir() {
        NodoListaSimple nodoAux = primero;
        System.out.println(nodoAux.getUsuario().getNombre());
        while (nodoAux.getSiguiente() != null) {
            nodoAux = nodoAux.getSiguiente();
            System.out.println(nodoAux.getUsuario().getNombre());
        }
    }

    public int DevolverNumeroNodo(String referencia) {
        NodoListaSimple aux = primero;
        int numeroNodo = 0;
        while (aux != null) {
            if (referencia.equals(aux.getUsuario().getNombre())) {
                return numeroNodo;
            } else {
                aux = aux.getSiguiente();
                numeroNodo++;
            }
        }
        return numeroNodo;
    }

    

}
