package com.greenfoxacademy.expressions_and_control_flow;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        System.out.println("Kérem írja be a nevét:");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        System.out.println("Hello" + " " + userInput + "!");

    }
}
