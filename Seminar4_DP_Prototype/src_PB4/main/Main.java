package main;

import clase.ARezervare;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        ARezervare rezervare1 = new Rezervare("Sabina", 20, 6, 4, false);
        ARezervare rezervare2 = rezervare1.clone(19);

        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}
