package com.greenfoxacademy.functions;

public class Factorio {

    public static void main(String[] args) {

        // - Hozz létre egy class-t `Factorio` névvel és benne a main függvényt.

// - Készíts egy függvényt `factorio` névvel,
//   mely visszaadja a bemeneti paraméter faktoriális értékét.

        factorio(4);

    }
    public static void factorio(int factorialValue)  {
        int sumValue=1;
        for (int i = factorialValue; i>1; i--) {
            sumValue*=i;
        }
        System.out.println(sumValue);

    }

}
