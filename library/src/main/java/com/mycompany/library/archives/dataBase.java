/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.archives;

import com.mycompany.library.books.book;
import com.mycompany.library.lists.*;
import com.mycompany.library.students.student;
import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class dataBase implements Serializable{
    //This class will work as the library's database
    
    private genericList<student> studentsList; //List of students
    private genericList<book> booksList; //List of books

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

    public dataBase() {
        //The lists are inicialized
        studentsList = new genericList<>();
        booksList = new genericList<>();
    }
    
    
}
