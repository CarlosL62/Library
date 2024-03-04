/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.books;

import java.io.Serializable;
import java.time.*;

/**
 *
 * @author carlos
 */
public class book implements Serializable{
    
    protected String codeBook; // variable to save the code of the book
    protected String title; // variable to save the title
    protected int noCopies; // variable to save the number of copies
    protected String autor; // variable to save the autor
    protected String editorial; // variable to save the editorial
    protected LocalDate publicationDay; // variable to save the publication day

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNoCopies() {
        return noCopies;
    }

    public void setNoCopies(int noCopies) {
        this.noCopies = noCopies;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getPublicationDay() {
        return publicationDay;
    }

    public void setPublicationDay(LocalDate publicationDay) {
        this.publicationDay = publicationDay;
    }
    
    
    
}
