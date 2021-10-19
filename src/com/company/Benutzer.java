package com.company;

import java.util.List;

public class Benutzer {
    //vorname, nachname, sport
    //methoden: kalkuliereZeit(), kalkuliereZeit(Sport), Durchschnittzeit()
    private String name;
    private String vorname;
    private List<Sport> _sportarten;

    public Benutzer(String name, String vorname, List<Sport> sportarten) {
        name = name;
        vorname = vorname;
        _sportarten = sportarten;
    }

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

//Methode fuer Zeit rechnen
    public double kalkuliereZeit(){
        double zeit = 0;
        for(Sport sportarten : _sportarten){
            zeit = zeit + sportarten.kalkuliereZeit();
        }
        return zeit;
    }

    //Methode fur das Kalkulieren fur einen Sportart
    public double kalkuliereZeit(Sport sportarten){
        return sportarten.kalkuliereZeit();
    }

    //Methode fur das Kalkulieren der Durchschnittszeit
    public double DurschschnittZeit(){
        return kalkuliereZeit() / _sportarten.size();
    }


}
