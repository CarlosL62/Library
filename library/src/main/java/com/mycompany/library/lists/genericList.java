/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.lists;

import java.io.Serializable;


/**
 *
 * @author carlo
 */
public class genericList<T> implements Serializable{
    
    private genericNode<T> beginning;
    private genericNode<T> last;
    private int size = 0;
    
    public void addNodo(T value) {
        genericNode<T> newN = new genericNode<>(value);
        if (isEmpty()) {
            beginning = newN;
            last = newN;
        } else {
            last.setNext(newN);
            last = newN;
        }
        size++;
    }
    
    public void deleteLast() throws listException {
        if (isEmpty()) {
            throw new listException("La lista está vacía");
        }
        if (size == 1) {
            beginning = null;
            last = null;
            size = 0;
        } else {
            int beforeLastIndex = size - 2;
            genericNode<T> beforeLast = getNodo(beforeLastIndex);
            beforeLast.setNext(null);
            last = beforeLast;
            size--;
        }
    }
    
    public T getValue(int indice) throws listException {
        return getNodo(indice).getContent();
    }
    
    public boolean isEmpty() {
        return beginning == null;
    }
    
    public int getSize() {
        return size;
    }

    public void deleteNode(int indice) throws listException {
        if (indice < 0 || indice >= size) {
            throw new listException("Indice fuera de rango");
        }
        if (size == 1 || indice == size - 1) {
            deleteLast();
        } else if (indice == 0) {
            beginning = beginning.getNext();
            size--;
        } else {
            genericNode nodoAnterior = getNodo(indice - 1);
            genericNode nodoAEliminar = nodoAnterior.getNext();
            nodoAnterior.setNext(nodoAEliminar.getNext());
            size--;
        }
    }
    
    private genericNode<T> getNodo(int indice) throws listException {
        if (isEmpty()) {
            throw new listException("La lista está vacía");
        }
        
        if (indice < 0 || indice >= size) {
            throw new listException("Indice fuera de rango");
        }
        
        genericNode<T> nodoActual = beginning;
        for (int i = 0; i < indice; i++) {
            genericNode siguiente = nodoActual.getNext();
            nodoActual = siguiente;
        }
        
        return nodoActual;
    }
}
