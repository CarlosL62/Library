/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.errorManagement;

import java.time.*;

/**
 *
 * @author carlos
 */
public class errorManagement {

    private LocalDate localDate = LocalDate.now();

    //Verifies if the string only contains numbers
    public boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //Verifies if the string only contains letters
    public boolean isText(String str) {
        return str.matches("[^0-9]+");
    }

    // verifies if the string is a valid carnet
    public boolean isValidCarnet(String str) {
        return str.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
    }

    // verifies if the string is a valid code
    public boolean isValidBookCode(String str) {
        return str.matches("[0-9][0-9][0-9]-[a-zA-Z][a-zA-Z][a-zA-Z]");
    }

    public boolean isNumber(String str) {
        return str.matches("[0-9]+");
    }

    public boolean isValidCareer(String str) {
        return str.matches("[1-5]");
    }

    public boolean isValidDate(String str) {
        return str.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}");
    }

    //Verifies date
    public boolean isDate(String yyyy, String mm, String dd) {
        //Verifies all the string are numbers
        if (isInt(yyyy) && isInt(mm) && isInt(dd)) {
            if (!(Integer.parseInt(yyyy) > 0 && Integer.parseInt(yyyy) <= localDate.getYear())) {
                return false;
            }
            if (!(Integer.parseInt(mm) > 0 && Integer.parseInt(mm) <= 12)) {
                return false;
            }
            if (!(Integer.parseInt(dd) > 0 && Integer.parseInt(dd) <= 31)) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

}
