package com.greenfoxacademy.data_structures;

public class TodoPrint {

    public static void main(String... args) {

        // Add hozzá a "My todo:" szöveget a todoText szövege elejéhez.
        // Add hozzá a " - Download games" szöveget a todoText szöveg végéhez.
        // Add hozzá a " - Diablo" szöveget a todoText szöveg végéhez,
        // de behúzással.

        // Várt eredmény:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String todoText = " - Buy milk\n";
        String titleText = "My todo:\n";
        String todoTextAdd = " - Download games\n";
        String todoTextEnd = "\t - Diablo";

        System.out.println(titleText+todoText+todoTextAdd+todoTextEnd);

    }
}
