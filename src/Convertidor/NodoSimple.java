/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertidor;

import Categorias.Categoria;

public class NodoSimple {

    private Categoria categoria;
    private NodoSimple siguiente;

    public NodoSimple(Categoria elemento, NodoSimple siguiente) {
        this.categoria = elemento;
        this.siguiente = siguiente;
    }

    public Categoria getDato() {
        return categoria;
    }

    public void setDato(Categoria elemento) {
        this.categoria = elemento;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}
