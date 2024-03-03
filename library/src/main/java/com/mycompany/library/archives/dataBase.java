/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.archives;

import com.mycompany.library.lists.*;
import com.mycompany.library.students.student;
import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class dataBase implements Serializable{
    //This class will work as the library's database
    
    private genericList<student> students; //List of students

    public genericList<student> getStudents() {
        return students;
    }

    public void setStudents(genericList<student> students) {
        this.students = students;
    }

    public dataBase() {
        //The lists are inicialized
        students = new genericList<>();
    }
    
    
}
