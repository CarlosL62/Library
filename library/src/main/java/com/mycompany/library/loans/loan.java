/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.loans;

import java.io.Serializable;
import java.time.*;

/**
 *
 * @author carlos
 */
public class loan implements Serializable {
    
    private int studentCarnet;
    private String bookCode;
    private boolean payed = false;
    private LocalDate beginDate;
    private LocalDate endDate;

    public int getStudentCarnet() {
        return studentCarnet;
    }

    public void setStudentCarnet(int studentCarnet) {
        this.studentCarnet = studentCarnet;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
}
