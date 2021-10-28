package com.greenfoxacademy.functions;

public class Sum {

    public static void main(String[] args) {

// - Hozz létre egy class-t `Sum` névvel és benne a main függvényt.

// - Készíts egy függvényt `sum` névvel mely összeadja a számokat
//   nullától a bemeneti paraméterig és visszaadja azok összegét.

        int number = 5;

        System.out.println(sum(number));
    }

    public static int sum(int sumNumber) {

        for (int i = sumNumber; i > 0; i--) {
            sumNumber += i - 1;
        }
        return sumNumber;
    }
}
