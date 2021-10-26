package com.greenfoxacademy.functions;

public class Sum {

    public static void main(String[] args) {

// - Hozz létre egy class-t `Sum` névvel és benne a main függvényt.

// - Készíts egy függvényt `sum` névvel mely összeadja a számokat
//

        sum(3);

    }

    public static void sum(int beginnerNumber) {

        int sumNumber = 0;
        for (int i = beginnerNumber; i > 0; i--) {
            sumNumber += i;
        }
        System.out.println("A számok összege " + beginnerNumber + "-ig: " + sumNumber);
    }
}
