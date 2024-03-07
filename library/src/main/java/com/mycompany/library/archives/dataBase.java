/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.archives;

import com.mycompany.library.books.book;
import com.mycompany.library.lists.*;
import com.mycompany.library.loans.loan;
import com.mycompany.library.students.student;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class dataBase implements Serializable{
    //This class will work as the library's database
    
    private ArrayList<student> studentsList;
    private ArrayList<book> booksList;
    private ArrayList<loan> loansList;

    public ArrayList<student> getStudentsList() {
        return studentsList;
    }

    public ArrayList<book> getBooksList() {
        return booksList;
    }

    public ArrayList<loan> getLoansList() {
        return loansList;
    }
    
    
    
    /*private genericList<student> studentsList; //List of students
    private genericList<book> booksList; //List of books
    private genericList<loan> loansList; //list of loans

    public genericList<student> getStudents() {
        return studentsList;
    }

    public void setStudents(genericList<student> students) {
        this.studentsList = students;
    }

    public genericList<book> getBooks() {
        return booksList;
    }

    public void setBooks(genericList<book> books) {
        this.booksList = books;
    }

    public genericList<loan> getLoansList() {
        return loansList;
    }

    public void setLoansList(genericList<loan> loansList) {
        this.loansList = loansList;
    }*/

    public dataBase() {
        //The lists are inicialized
        studentsList = new ArrayList<student>();
        booksList = new ArrayList<book>();
        loansList = new ArrayList<loan>();
    }
    
    
}
