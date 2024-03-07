/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.students;

import java.io.Serializable;
import java.time.*;

/**
 *
 * @author carlos
 */
public class student implements Serializable{
    
    protected String name; //variable to save the name
    protected int carnet; //variable to save the carnet
    protected int codeCareer; //variable to save de code of the career
    protected LocalDate birthday; //varible to save the birthaday

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getCodeCareer() {
        return codeCareer;
    }

    public void setCodeCareer(int codeCareer) {
        this.codeCareer = codeCareer;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
}
