/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.archives;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author carlos
 */
public class archive {
    
    private File archive;
    private String fileRoute = "./dataBase.db";
    
    //DATABASE
    public dataBase startdb() throws FileNotFoundException, IOException {
        dataBase dataBase = null;
        archive = new File(fileRoute);
        if (archive.exists()) {
            try (
                    FileInputStream inFile = new FileInputStream(archive);
                    ObjectInputStream inputStream = new ObjectInputStream(inFile)) {
                    dataBase = (dataBase) inputStream.readObject();
                    inputStream.close();
                    inFile.close();
                    System.out.println("DB opened");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            dataBase = new dataBase();
            System.out.println("DB created");
        }
        return dataBase;
    }
    
    public void savedb(dataBase dataBase){
        archive = new File(fileRoute);
        try (
                FileOutputStream outFile = new FileOutputStream(archive);
                ObjectOutputStream outputStream = new ObjectOutputStream(outFile)) {
                outputStream.writeObject(dataBase);
                outputStream.close();
                outFile.close();
                System.out.println("DB saved");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
