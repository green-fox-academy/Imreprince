package com.greenfoxacademy.arrays;

public class PrintAll {

    public static void main(String[] args) {

        // - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[4, 5, 6, 7]`
// - Írasd ki a konzolra a `numbers` nevű tömb összes elemét

        int[] numbers = new int[]{4, 5, 6, 7};
        System.out.println("A tömb összes eleme:" + " ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}