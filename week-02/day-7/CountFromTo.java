package com.greenfoxacademy.expressions_and_control_flow;

import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {

        // Készíts egy programot, ami két számot kér
// Ha a második szám nem nagyobb, mint az első, írja ki:
// "A második számnak nagyobbnak kellene lennie!"
//
// Amennyiben nagyobb,
// az első számtól kezdve el kellene számolnia egyesével a másodikig
//
// Például:
//
// első szám: 3, második szám: 6, ezt kellene printelnie:
//
// 3
// 4
// 5

        System.out.println("Kérem írjon be egy számot:");

        Scanner scanner = new Scanner(System.in);
        int userinput1 = scanner.nextInt();

        System.out.println("Kérem írjon be még egy számot");
        int userinput2 = scanner.nextInt();

        if (userinput1 > userinput2) {
            System.out.println("A második számnak nagyobbnak kellene lennie!");
            System.out.println("Kérem írjon be az első számnál nagyobb számot");
            System.out.println();
            userinput2 = scanner.nextInt();
        }
        int i = userinput1;
        while (i <= userinput2) {
            System.out.println(i);
            i++;
        }
    }
}
