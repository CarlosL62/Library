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
public class genericNode<T> implements Serializable{
    
    private T content;
    private genericNode next;

    public genericNode(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public genericNode getNext() {
        return next;
    }

    public void setNext(genericNode next) {
        this.next = next;
    }
}
