package com.greenfoxacademy.expressions_and_control_flow;

import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        /// Írj egy olyan programot, ami egy számot (használj double-t) kér
        //    // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        //    // majd ezt átszámítja és kiírja a távolságot kilométerben
        //  }


        System.out.println("Kérem adja meg a távolságot mérföldben:");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        System.out.println("A megadott távolság:" + " " + userInput + " " + "mérföld.");

        double gearNumber = 1.609344;
        double kilometer = Double.valueOf(userInput);
        double sumKilometer = kilometer * gearNumber;
        System.out.println("Ez pontosan:" + " " + sumKilometer + " " + "kilométer.");
        System.out.printf("Kerekítve pedig ennyi kilométer:" + " " + "%.0f", sumKilometer);

    }


}
