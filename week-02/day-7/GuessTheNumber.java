package com.greenfoxacademy.expressions_and_control_flow;

import java.util.Scanner;

import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        // Írj egy programot ami tárol egy számot és
// a felhasználónak kell kitalálnia azt.
// A felhasználó találgathat és
// minden standard input-ba beírt szám után
// a programnak ki kell írnia egyet ezek közül:
//
// A tárolt szám nagyobb
// A tárolt szám kisebb
// Eltaláltad a számot

        Random rand = new Random();
        int randomNumber = rand.nextInt(10);

        System.out.println("Kérem írjon be egy számot:");

        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        do {
            userInput = scanner.nextInt();
            if (userInput > randomNumber) {
                System.out.println("A tárolt szám kisebb!");
            } else if (userInput < randomNumber) {
                    System.out.println("A tárolt szám nagyobb");
            }
        } while (userInput != randomNumber);

        if (userInput == randomNumber) {
            System.out.println("Eltaláltad a számot!");
        }
    }
}
