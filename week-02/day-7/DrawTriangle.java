package com.greenfoxacademy.expressions_and_control_flow;
import  java.util.Scanner;

public class DrawTriangle {

    public static void main(String[] args) {

        // Hozz létre egy egész szám típusú, lineCount nevű változót.
// Írj egy programot, ami egy számot kér a standard input-ból és
// elmenti azt a lineCount változóban.
// Rajzoljon egy ilyen háromszöget:
//
// *
// **
// ***
// ****
//
// A háromszögnek annyi sora legyen, mint amennyi a lineCount értéke.

        System.out.println("Kérem írjon be egy számot!");
        Scanner scanner = new Scanner(System.in);
        int lineCount = scanner.nextInt();

        for (int i=1; i<=lineCount; i++  )  {;
            for (int j=1; j<=i; j++)  {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
