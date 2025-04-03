package main;

import clase.IBuilder;
import clase.Rezervare;
import clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder rezervareBuilder = new RezervareBuilder("Ionescu Nicolae");

        Rezervare rezervare1;
        Rezervare rezervare2;

        IBuilder rezervareBuilder1 = new RezervareBuilder("Tache Ionescu");

        rezervare1 = rezervareBuilder.buildRezervare();
        rezervare2 = rezervareBuilder1.setGenMuzica("rock").buildRezervare();

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}
