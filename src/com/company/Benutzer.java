package com.company;

import java.util.List;

public class Benutzer {
    //Attributen: name, vorname, lieblingssportarten
    //Methoden: kalkuliereZeit(), kalkuliereZeit(sportart), Durchschnittzeit()
    private String name;
    private String vorname;
    private List<Sport> _sportarten;


    //Konstruktor von Benutzer
    public Benutzer(String name, String vorname, List<Sport> sportarten) {
        name = name;
        vorname = vorname;
        _sportarten = sportarten;
    }

    //Getters und setters
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getVorname() {

        return vorname;
    }

    public void setVorname(String vorname) {

        this. vorname = vorname;
    }

    public List<Sport> getSportarten() {

        return _sportarten;
    }

    public void setSportarten(List<Sport> sportarten) {

        this._sportarten = sportarten;
    }

//Methode für das Kalkulieren der gesamten Zeit für Sport getrieben von Benutzer
    public double kalkuliereZeit(){
        double zeit = 0;
        for(Sport sportarten : _sportarten){
            zeit = zeit + sportarten.kalkuliereZeit();
        }
        return zeit;
    }

    //Methode für das Kalkulieren für einen Sportart
    public double kalkuliereZeit(Sport sportarten){
        return sportarten.kalkuliereZeit();
    }

    //Methode für das Kalkulieren der Durchschnittzeit
    public double DurschschnittZeit(){
        return kalkuliereZeit() / _sportarten.size();
    }


}
