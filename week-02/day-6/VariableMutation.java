package com.greenfoxacademy.expressions_and_control_flow;

public class VariableMutation {

    public static void main(String[] args) {
        //    int a = 3;
        //    // Növeld meg az "a" változó értékét 10-zel
        //
        //    System.out.println(a);
        //
        //    int b = 100;
        //    // Csökkentsd a "b" változó értékeét 7-tel
        //
        //    System.out.println(b);
        //
        //    int c = 44;
        //    // A c értéke legyen dupla akkora
        //
        //    System.out.println(c);
        //
        //    int d = 125;
        //    // Oszd el a d-t 5-tel
        //
        //    System.out.println(d);
        //
        //    int e = 8;
        //    // Emeld köbre az e változó értékét
        //
        //    System.out.println(e);
        //
        //    int f1 = 123;
        //    int f2 = 345;
        //    // Logikai (boolean) értékként írasd ki hogy f1 nagyobb-e f2-nél
        //
        //    int g1 = 350;
        //    int g2 = 200;
        //    // Mondja meg a program, hogy g2 duplája nagyobb-e g1-nél (boolean)
        //
        //    int h = 135798745;
        //    // Mondja meg a program, hogy osztható-e 11-el maradék nélkül?
        //    // Írasd is ki logikai (boolean) értékként
        //
        //    int i1 = 10;
        //    int i2 = 3;
        //    // Mondja meg a program hogy i1 nagyobb-e i2 négyzeténél ÉS ugyanakkor kisebb-e i2 köbénél (boolean)
        //
        //    int j = 1521;
        //    // Írasd ki, hogy j osztható-e 3-mal vagy 5-tel (boolean)
        //  }
        //}

        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c += c;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e = e * e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f = f1 > f2;
        System.out.println(f);

        int g1 = 350;
        int g2 = 200;
        boolean g = g2 * 2 > g1;
        System.out.println(g);

        int h = 135798745;
        int h1 = h %= 11;
        boolean h2 = h1 == 0;
        System.out.println(h2);

        int i1 = 10;
        int i2 = 3;
        boolean i = i1 > i2 * i2 && i1 < i2 * i2 * i2;
        System.out.println(i);

        int j = 1521;
        int j2 = j %= 3;
        int j3 = j %= 5;
        boolean js = j2 == 0 || j3 == 0;
        System.out.println(js);



    }
}
