/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.logic;

import com.mycompany.library.archives.dataBase;
import com.mycompany.library.books.book;
import com.mycompany.library.errorManagement.errorManagement;
import com.mycompany.library.loans.loan;
import com.mycompany.library.students.student;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author hamme
 */
public class logic {

    private String currentSection = "VACIO";
    private boolean stateContent;
    private String temporalTitle = null;
    private String temporalAuthor = null;
    private String temporalBookCode = null;
    private int temporalBookCopies = 0;
    private int temporalCarnet = 0;
    private String temporalName = null;
    private int temporalCareer = 0;
    private int fieldsNumber = 0;
    private int registryNumber = 0;
    private String temporalDay = null, temporalMonth = null, temporalYear = null;
    private boolean validDate = false;

    private student newStudent;
    private book newBook;
    private loan newLoan;
    private List<student> lsStudent;
    private List<book> lsBook;
    private LocalDate beginDate;

    private dataBase dataBase;

    public logic(dataBase dataBase) {
        this.dataBase = dataBase;
    }

    errorManagement util = new errorManagement();

    public void splitWords(String fileContent) {

        newStudent = new student();
        newBook = new book();
        newLoan = new loan();

        String temporalString = fileContent;

        String[] contentSplited = temporalString.split(":");

        if (this.currentSection.equals("LIBRO")) {
            this.stateContent = splitBooksInfo(contentSplited[0], contentSplited[1]);
        } else if (this.currentSection.equals("ESTUDIANTE")) {
            this.registryNumber = this.registryNumber + 1;
            this.stateContent = splitStudentsInfo(contentSplited[0], contentSplited[1]);
        } else if (this.currentSection.equals("PRESTAMO")) {
            this.registryNumber = this.registryNumber + 1;
            this.stateContent = splitLoansInfo(contentSplited[0], contentSplited[1]);
        } else if (this.currentSection.equals("SALTO DE LINEA")) {
            this.stateContent = false;
            System.out.println("Estamos en la seccion SALTO DE LINEA");
        } else if (this.currentSection.equals("VACIO")) {
            this.stateContent = false;
        }

        switch (contentSplited[0]) {
            case "LIBRO":
                this.currentSection = contentSplited[0];
                this.stateContent = true;
                this.registryNumber = this.registryNumber + 1;
                break;
            case "ESTUDIANTE":
                this.currentSection = contentSplited[0];
                this.stateContent = true;
                break;
            case "PRESTAMO":
                this.currentSection = contentSplited[0];
                this.stateContent = true;
                break;
            default:
                if (stateContent == false) {
                    this.currentSection = "VACIO";
                }
        }

    }

    private boolean splitBooksInfo(String splitOne, String splitTwo) {

        boolean returnValue = true;

        switch (splitOne) {
            case "TITULO":
                this.temporalTitle = splitTwo;
                this.fieldsNumber = this.fieldsNumber + 1;
                break;
            case "AUTOR":
                if (util.isText(splitTwo)) {
                    this.temporalAuthor = splitTwo;
                } else {
                    this.temporalAuthor = null;
                }
                this.fieldsNumber = this.fieldsNumber + 1;
                break;
            case "CODIGO":
                if (util.isValidBookCode(splitTwo)) {

                    lsBook = dataBase.getBooksList().stream().filter(x -> x.isBookCode(splitTwo)).collect(Collectors.toList());

                    if (lsBook.size() == 0) {
                        this.temporalBookCode = splitTwo;
                    } else {
                        this.temporalBookCode = null;
                    }
                    
                } else {
                    this.temporalBookCode = null;
                }
                this.fieldsNumber = this.fieldsNumber + 1;
                break;
            case "CANTIDAD":
                if (util.isNumber(splitTwo)) {
                    this.temporalBookCopies = Integer.parseInt(splitTwo);
                } else {
                    this.temporalBookCopies = -1;
                }
                this.fieldsNumber = this.fieldsNumber + 1;
                break;
            default:
                throw new AssertionError();
        }

        if (this.fieldsNumber == 4) {
            if (this.temporalTitle != null && this.temporalAuthor != null && this.temporalBookCode != null
                    && this.temporalBookCopies >= 0) {
                System.out.println("\nSi se puede guardar el registro #" + this.registryNumber);
                System.out.println("El titulo es: " + this.temporalTitle);
                System.out.println("El autor es: " + this.temporalAuthor);
                System.out.println("El codigo es: " + this.temporalBookCode);
                System.out.println("La cantidad es: " + this.temporalBookCopies);
                newBook.setTitle(this.temporalTitle);
                newBook.setAutor(this.temporalAuthor);
                newBook.setCodeBook(this.temporalBookCode);
                newBook.setNoCopies(this.temporalBookCopies);
                dataBase.getBooksList().add(newBook);
                this.temporalTitle = null;
                this.temporalAuthor = null;
                this.temporalBookCode = null;
                this.temporalBookCopies = -1;
            } else {
                System.out.println("\nNo se puede guardar el registro #" + this.registryNumber);
            }

            this.fieldsNumber = 0;
            returnValue = false;
        }

        return returnValue;
    }

    private boolean splitStudentsInfo(String splitOne, String splitTwo) {

        boolean returnValue = true;

        switch (splitOne) {
            case "CARNET":
                if (util.isValidCarnet(splitTwo)) {

                    lsStudent = dataBase.getStudentsList().stream().filter(x -> x.isCarnet(splitTwo)).collect(Collectors.toList());

                    if (lsStudent.size() == 0) {
                        this.temporalCarnet = Integer.parseInt(splitTwo);
                    } else {
                        this.temporalCarnet = -1;
                    }
                } else {
                    this.temporalCarnet = -1;
                }
                this.fieldsNumber = this.fieldsNumber + 1;
                break;
            case "NOMBRE":
                if (util.isText(splitTwo)) {
                    this.temporalName = splitTwo;
                } else {
                    this.temporalName = null;
                }
                this.fieldsNumber = this.fieldsNumber + 1;
                break;
            case "CARRERA":
                if (util.isValidCareer(splitTwo)) {
                    this.temporalCareer = Integer.parseInt(splitTwo);
                } else {
                    this.temporalCareer = -1;
                }
                this.fieldsNumber = this.fieldsNumber + 1;
                break;
            default:
                throw new AssertionError();
        }

        if (this.fieldsNumber == 3) {
            if (this.temporalCareer >= 1 && this.temporalCareer <= 5 && this.temporalName != null
                    && this.temporalCarnet > 0) {
                System.out.println("\nSi se puede guardar el registro #" + this.registryNumber);
                System.out.println("El carnet es: " + this.temporalCarnet);
                System.out.println("El nombre es: " + this.temporalName);
                System.out.println("La carrera es: " + this.temporalCareer);
                newStudent.setCarnet(temporalCarnet);
                newStudent.setName(temporalName);
                newStudent.setCodeCareer(temporalCareer);
                dataBase.getStudentsList().add(newStudent);
                this.temporalCareer = 0;
                this.temporalName = null;
                this.temporalCarnet = -1;
            } else {
                System.out.println("\nNo se puede guardar el registro #" + this.registryNumber);
            }

            this.fieldsNumber = 0;
            returnValue = false;
        }

        return returnValue;
    }

    private boolean splitLoansInfo(String splitOne, String splitTwo) {

        boolean returnValue = true;

        switch (splitOne) {
            case "CODIGOLIBRO":
                if (util.isValidBookCode(splitTwo)) {
                    this.temporalBookCode = splitTwo;
                } else {
                    this.temporalBookCode = null;
                }
                this.fieldsNumber = this.fieldsNumber + 1;
                break;
            case "CARNET":
                if (util.isValidCarnet(splitTwo)) {
                    this.temporalCarnet = Integer.parseInt(splitTwo);
                } else {
                    this.temporalCarnet = -1;
                }
                this.fieldsNumber = this.fieldsNumber + 1;
                break;
            case "FECHA":
                if (util.isValidDate(splitTwo)) {
                    String[] contentSplited = splitTwo.split("-");
                    this.temporalYear = contentSplited[0];
                    this.temporalMonth = contentSplited[1];
                    this.temporalDay = contentSplited[2];

                    if (util.isDate(this.temporalYear, this.temporalMonth, this.temporalDay)) {
                        this.validDate = true;
                        this.beginDate = LocalDate.of(Integer.parseInt(this.temporalYear),
                                Integer.parseInt(this.temporalMonth), Integer.parseInt(this.temporalDay));
                    } else {
                        this.temporalYear = null;
                        this.temporalMonth = null;
                        this.temporalDay = null;
                        this.validDate = false;
                    }

                } else {
                    this.validDate = false;
                }
                this.fieldsNumber = this.fieldsNumber + 1;
                break;
            default:
                throw new AssertionError();
        }

        if (this.fieldsNumber == 3) {
            if (this.temporalBookCode != null && this.temporalCarnet > 0
                    && this.validDate == true) {
                System.out.println("\nSi se puede guardar el registro #" + this.registryNumber);
                System.out.println("El codigo del libro es: " + this.temporalBookCode);
                System.out.println("El carnet es: " + this.temporalCarnet);
                System.out.println("La fecha es: " + this.temporalYear + "/" + this.temporalMonth
                        + "/" + this.temporalDay);
                newLoan.setBookCode(this.temporalBookCode);
                newLoan.setStudentCarnet(this.temporalCarnet);
                newLoan.setBeginDate(this.beginDate);
                dataBase.getLoansList().add(newLoan);
                this.temporalBookCode = null;
                this.temporalCarnet = -1;
                this.temporalYear = null;
                this.temporalMonth = null;
                this.temporalDay = null;
                this.validDate = false;
            } else {
                System.out.println("\nNo se puede guardar el registro #" + this.registryNumber);
            }

            this.fieldsNumber = 0;
            returnValue = false;
        }

        return returnValue;
    }

    public void setRegistryNumber(int registryNumber) {
        this.registryNumber = registryNumber;
    }

}
