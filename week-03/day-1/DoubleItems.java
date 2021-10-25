package com.greenfoxacademy.arrays;

public class DoubleItems {

    public static void main(String[] args) {

        // - Készíts egy `numList` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
// - Duplázd meg minden elem értéket a tömbben

        int[] numList = new int[]{3, 4, 5, 6, 7};
        System.out.println("A numbers nevű tömb összes elememegduplázva: ");
        for (int i = 0; i < numList.length; i++) {
            System.out.print(numList[i]*2 + " ");
        }

    }
}
