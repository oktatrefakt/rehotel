/*
* File: Main.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-11-19
* Github: https://github.com/andrewteki/
* Licenc: MIT
*/

/*
Ez a miniszoftver egy hotel szállásfoglalásának alapadatait 
kéri be és menti el. A program induláskor megjeleníti a 
„Hotelfoglalás” címet, valamint a szerkesztő nevét és a 
verziószámot. Ezután a felhasználó megadja a szobaszámot, 
a vendég nevét, az érkezés dátumát és a távozás dátumát.
*/

//A csomag jelzése
package com.example;

//Importálni kell a Scanner osztályt, mert használjuk:
import java.util.Scanner;

//Főosztály Main:
public class Main {
    // A főporogram.
    public static void main(String[] args) {
        System.out.println("Hotelfoglalás");

        //Itt egy névjegyet írunk a képernyőre:
        System.out.println("==============================");
        System.out.println("Szerkesztő: Sallai András");
        System.out.println("Verzió: 1.0");
        System.out.println("==============================");

        Scanner scanner = new Scanner(System.in);

System.out.print("Kérem a szobaszámot:");
String roomNumber = scanner.nextLine();

    System.out.print("Vendég neve: ");
    String guestName = scanner.nextLine();

/* ITT JÖN A DÁTUM BEKÉRÉSE */        

/*
A dátumokat év-hónap-nap formátumban kell megadni, 
például: 2026-12-24. A program a megadott adatokat 
kettőspontokkal elválasztva egyetlen szöveggé 
fűzi össze, majd átadja a Tar.mento() metódusnak 
mentésre.
*/

        // érkezés dátuma
        System.out.print("Érkezés dátuma (YYYY-MM-DD): ");
        String checkInDate = scanner.nextLine();

        // távozás dátuma
        System.out.print("Távozás dátuma (YYYY-MM-DD): ");
        String checkOutDate = scanner.nextLine();

        String e = 
            roomNumber + ":" +
            guestName + ":" +
            checkInDate + ":" +
            checkOutDate + "\n";
        
        /* Meghívjuk a mentés végző metódust.
           Ez a Tar osztályban található. A
           mentést a mento() függvény végzi:
        */
        Tar.mento(e);


    }
}