package com.greenfoxacademy.expressions_and_control_flow;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

             // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
            // majd kiírja, hogy "Páros", ha páros és
           // kiírja, hogy "Páratlan", ha páratlan.

        System.out.println("Kérem írjon be egy egész számot:");

        Scanner scanner = new Scanner(System.in);
        int userinput = scanner.nextInt();

        System.out.println(userinput%2==0?"Ez a szám páros.":"Ez a szám páratlan.");

    }
}
