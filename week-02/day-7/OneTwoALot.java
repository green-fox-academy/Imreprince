package com.greenfoxacademy.expressions_and_control_flow;

import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {

        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // Ha a szám kisebb vagy egyenlő 0-val, írja ki, hogy: "Nem elég"
        // Ha a szám egyenlő 1-gyel, írja ki, hogy: "Egy"
        // Ha a szám egyenlő 2-vel, írja ki, hogy: "Kettő"
        // Ha a szám nagyobb, mint 2, írja ki, hogy: "Sok"

        System.out.println("Kérem írjon be egy számot:");

        Scanner scanner = new Scanner(System.in);
        double userinput = scanner.nextDouble();

        if (userinput <= 0) {
            System.out.println("Nem elég");
        } else if (userinput == 1) {
            System.out.println("Egy");
        } else if (userinput == 2) {
            System.out.println("Kettő");
        } else System.out.println("Sok");

    }

}
