package com.company;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Sport fussball = new Fussball();
        Sport basketball = new Basketball();
        Sport hindernislauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        Benutzer b1 = new Benutzer("Smith", "Bob", Arrays.asList(fussball, basketball));
        Benutzer b2 = new Benutzer("James", "Lily", Arrays.asList(basketball, hindernislauf, fussball));
        Benutzer b3 = new Benutzer("Meyer","Florian", Arrays.asList(hochsprung, basketball, basketball));


        System.out.println("Benutzer 1: ");
        System.out.println("Totalzeit:" +b1.kalkuliereZeit());
        System.out.println("Sportarten: " + b1.kalkuliereZeit(fussball)+" "+ b1.kalkuliereZeit(basketball));
        System.out.println("Durchschnittzeit: "+ b1.DurschschnittZeit());
        System.out.println(" ");
        System.out.println("Benutzer 2: ");
        System.out.println("Totalzeit:" +b2.kalkuliereZeit());
        System.out.println("Sportarten: " + b2.kalkuliereZeit(basketball)+" "+ b2.kalkuliereZeit(hindernislauf) +" "+ b2.kalkuliereZeit(fussball));
        System.out.println("Durchschnittzeit: "+ b2.DurschschnittZeit());
        System.out.println(" ");
        System.out.println("Benutzer 3: ");
        System.out.println("Totalzeit:" + b3.kalkuliereZeit());
        System.out.println("Sportarten: " + b3.kalkuliereZeit(hochsprung)+" "+ b3.kalkuliereZeit(basketball)+" "+ b3.kalkuliereZeit(basketball));
        System.out.println("Durchschnittzeit: "+ b3.DurschschnittZeit());
    }
}
