package com.greenfoxacademy.data_structures;

import java.util.Arrays;

public class TakesLonger {

    public static void main(String... args) {

        // Az idézet mentésekor lemezhiba történt. Kérlek, javítsd ki.
        // Add hozzá az "always takes longer than"-t a StringBuilder (quote) -hoz
        // az "It" és a "you" szó közzé.
        // Használd a quote változó darabjait(a String újra definiálása helyett).

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String quoteAdd = "always takes longer than";

        String quoteBeginner = quote.substring(0, 20);
        String quoteEnd = quote.substring(20);
        System.out.println(quoteBeginner + " " + quoteAdd + quoteEnd);
    }
}
