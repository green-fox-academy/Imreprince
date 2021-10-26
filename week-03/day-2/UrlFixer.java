package com.greenfoxacademy.data_structures;

public class UrlFixer {

    public static void main(String... args) {


        // Véletlenül rossz URL-t kaptam egy vicces subreddithez.
        // Valószínűleg ez "odds" és nem "bots" akart lenni.
        // Továbbá az URL-ből hiányzik egy fontos rész, derítsd ki
        // melyik az és illeszd be.
        // Próbáld meg megoldani többféleképpen különböző String függvényekkel.

        String url = "https//www.reddit.com/r/nevertellmethebots";
        String urlModified = url.replace("bots", "odds");

        String urlBeginner = url.substring(0, 5);
        String urlEnd = urlModified.substring(5);

        System.out.println(urlBeginner + ":" + urlEnd);
    }
}
