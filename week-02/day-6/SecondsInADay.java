package com.greenfoxacademy.expressions_and_control_flow;

public class SecondsInADay {

    public static void main(String[] args) {


        //    // Írj egy programot, ami kiszámítja, hogy hány másodperc
        //    // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
        //    // lehet beállítani (a végeredmény is legyen egész szám)

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int gearNumber = 60;
        int hoursOfDay = 24;

        int oneDaySecond = 24 * 60 * 60;
        System.out.println(" Egy nap ennyi másodpercből áll:" + " " + oneDaySecond);

        int remainingSeconds = gearNumber - currentSeconds;
        System.out.println("A napból hátralévő másodperc:" + " " + remainingSeconds);
        int remainingMinutes = gearNumber - (currentMinutes + 1);
        System.out.println("A napból hátralévő perc:" + " " + remainingMinutes);
        int remainingHours = hoursOfDay - (currentHours + 1);
        System.out.println("A napból hátralévő óra:" + " " + remainingHours);

        int secondsOfRemainingHours = remainingHours * gearNumber * gearNumber;
        int secondsOfRemainingMinutes = remainingMinutes * gearNumber;
        int reaminingSumSeconds = secondsOfRemainingHours + secondsOfRemainingMinutes + remainingSeconds;

        System.out.println(reaminingSumSeconds + " " + "másodperc van még hátra a napból.");

    }
}
