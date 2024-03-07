/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.logic;

import com.mycompany.library.errorManagement.errorManagement;

/**
 *
 * @author hamme
 */
public class logic {

    private int totalLines, pointerSection = 0;
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

    errorManagement util = new errorManagement();

    public void splitWords(String fileContent, int lineNumber) {

        String temporalString = fileContent;
        int currentLine = lineNumber;

        this.totalLines = lineNumber;

        String[] contentSplited = temporalString.split(":");

        if (this.currentSection.equals("LIBRO")) {
            this.stateContent = splitBooksInfo(contentSplited[0], contentSplited[1], currentLine);
        } else if (this.currentSection.equals("ESTUDIANTE")) {
            this.registryNumber = this.registryNumber + 1;
            this.stateContent = splitStudentsInfo(contentSplited[0], contentSplited[1], currentLine);
        } else if (this.currentSection.equals("PRESTAMO")) {
            this.registryNumber = this.registryNumber + 1;
            this.stateContent = splitLoansInfo(contentSplited[0], contentSplited[1], currentLine);
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

    private boolean splitBooksInfo(String splitOne, String splitTwo, int currentLine) {

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
                    this.temporalBookCode = splitTwo;
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

    private boolean splitStudentsInfo(String splitOne, String splitTwo, int currentLine) {

        boolean returnValue = true;

        switch (splitOne) {
            case "CARNET":
                if (util.isValidCarnet(splitTwo)) {
                    this.temporalCarnet = Integer.parseInt(splitTwo);
                } else {
                }
                break;
            case "NOMBRE":
                System.out.print("El nombre del estudiante es: " + splitTwo);
                System.out.println(" Linea #" + currentLine);
                break;
            case "CARRERA":
                System.out.print("La carrera del estudiante es: " + splitTwo);
                System.out.println(" Linea #" + currentLine);
                System.out.println("");
                returnValue = false;
                break;
            default:
                throw new AssertionError();
        }

        return returnValue;
    }

    private boolean splitLoansInfo(String splitOne, String splitTwo, int currentLine) {

        boolean returnValue = true;

        switch (splitOne) {
            case "CODIGOLIBRO":
                System.out.print("El codigo del libro es: " + splitTwo);
                System.out.println(" Linea #" + currentLine);
                break;
            case "CARNET":
                System.out.print("El carnet del estudiante es: " + splitTwo);
                System.out.println(" Linea #" + currentLine);
                break;
            case "FECHA":
                System.out.print("La fecha del prestamo es: " + splitTwo);
                System.out.println(" Linea #" + currentLine);
                System.out.println("");
                returnValue = false;
                break;
            default:
                throw new AssertionError();
        }

        return returnValue;
    }

    public void setRegistryNumber(int registryNumber) {
        this.registryNumber = registryNumber;
    }

}
