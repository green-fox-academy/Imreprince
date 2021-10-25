package com.greenfoxacademy.arrays;

import java.util.stream.IntStream;

public class SumElements {

    public static void main(String[] args) {

        // - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[54, 23, 66, 12]`
// - Írasd ki a konzolra a `numbers` nevű tömb második és harmadik elemének összegét

        int[] numbers = {54, 23, 66, 12};

        System.out.print("A tömb 2. és 3. elemének összege:");
        System.out.println(numbers[1] + numbers[2]);
    }
}
