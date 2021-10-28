package com.greenfoxacademy.data_structures;

import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction1 {

    public static void main(String[] args) {

       /* Készíts egy üres listát, ami Stringeket tartalmaz.
        Írasd ki a lista elemeinek a számát.
                Add hozzá(add) Williemet a listához.
                Írasd ki a lista üres e vagy sem.
                Add hozzá Johnt a listához.
        Add hozzá Amandát a listához.
                Írasd ki a lista elemeinek a számát.
        Írasd ki a lista harmadik elemét.
        Iterálj végig a listán és írasd ki az összes nevet
        William
                John
        Amanda
        Töröld a második elemet a listából
        Iterálj végig a listán fordított sorrendben és írasd ki az összes nevet.
        Amanda
                William
        Távolítsd el a lista összes elemét. */

        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.size());

        list.add("William");
        System.out.println(list.isEmpty());

        list.add("John");
        list.add("Amanda");

        System.out.println(list.size());
        System.out.println(list.get(2));

        System.out.println("A listában szereplő nevek: ");

        for (String elements : list) {
            System.out.println(elements);
        }

        list.remove(1);

        Collections.reverse(list);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.clear();
        System.out.println(list.isEmpty());
    }
}
