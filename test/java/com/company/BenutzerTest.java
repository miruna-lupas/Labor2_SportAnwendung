package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {
    @Test
    void kalkuliereZeit(){
        Sport basketball = new Basketball();
        Sport fussball = new Fussball();
        Sport hindernislauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        Benutzer benutzer = new Benutzer("Smith", "Bob", Arrays.asList(basketball, fussball, hindernislauf, hochsprung));
        assertEquals(benutzer.kalkuliereZeit(), benutzer.kalkuliereZeit(basketball) + benutzer.kalkuliereZeit(fussball) + benutzer.kalkuliereZeit(hindernislauf) + benutzer.kalkuliereZeit(hochsprung));
    }

    @Test
    void testkalkuliereZeit(){
        Sport basketball = new Basketball();
        Sport fussball = new Fussball();
        Sport hindernislauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();
        Benutzer benutzer = new Benutzer("Smith", "Bob", Arrays.asList(basketball, fussball, hindernislauf, hochsprung));

        assertEquals(benutzer.kalkuliereZeit(basketball), 55);
        assertEquals(benutzer.kalkuliereZeit(fussball), 65);
        assertEquals(benutzer.kalkuliereZeit(hindernislauf), 30);
        assertEquals(benutzer.kalkuliereZeit(hochsprung), 20);
    }

    @Test
    void Durchschnitt(){
        Sport basketball = new Basketball();
        Sport fussball = new Fussball();
        Sport hindernislauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        Benutzer benutzer = new Benutzer("Smith", "Bob", Arrays.asList(basketball, fussball, hindernislauf, hochsprung));
        assertEquals(benutzer.DurschschnittZeit(), benutzer.kalkuliereZeit() / 4);

    }


}