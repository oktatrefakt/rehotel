/*
* File: Tar.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-11-19
* Github: https://github.com/andrewteki/
* Licenc: MIT
*/

//Csomag jelölése
package com.example;

//használt osztályok
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/* Az osztály, ami ment */
public class Tar {

    //mentés hozzáfűzéssel
    public static void mento(String content) {
        try {
        FileWriter fileWriter = new FileWriter(
            "reservations.txt", 
            Charset.forName("utf-8"), true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(content);


        printWriter.close();
        fileWriter.close();            
        } catch (IOException e) {
            // TODO: handle exception
        } //A catch ág vége

    }
}

//Ez az első változat: 1.0
/* végre kész */
