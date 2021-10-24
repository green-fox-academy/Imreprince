package com.greenfoxacademy.expressions_and_control_flow;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        // Írj egy programot, ami két számot kér a standard input-ból
        // Az első szám a lányok száma, akik jönnek a buliba
        // A második szám a fiúk száma
        //
        // Ha több, mint 20 ember eljön és a lányok és fiúk száma egyenlő
        // Írja ki, hogy: Ez a buli kitűnő!
        //
        // Ha több, mint 20 ember eljön, de a lányok - fiúk arány nem egyenlő
        // Írja ki, hogy: Ez a buli egész jó!
        //
        // Ha kevesebb, mint 20 ember jön el
        // Írja ki, hogy: Átlagos buli...
        //
        // Ha egy lány sem jön el, függetlenül az emberek számától
        // Írja ki, hogy: Virsli party

        System.out.println("Kérem adja meg, hogy hány lány jön a buliba:");

        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();

        System.out.println("Kérem adja meg, hogy hány fiú jön a buliba:");

        int userInput2 = scanner.nextInt();
        int sumUserInput = userInput1 + userInput2;

        if (sumUserInput > 20 && userInput1 == userInput2) {
            System.out.println("Ez a buli kitűnő!");
        } else if (sumUserInput > 20 && userInput1 != userInput2 && userInput1!=0) {
            System.out.println("Ez a buli egész jó!");
        } else if (sumUserInput < 20) {
            System.out.println("Ez egy átlagos buli!");
        } else if (userInput1==0) {
            System.out.println("Ez egy virsli party!");
        } else System.out.println("Bakker, pont húszan lesztek a partyn!");

    }

}
