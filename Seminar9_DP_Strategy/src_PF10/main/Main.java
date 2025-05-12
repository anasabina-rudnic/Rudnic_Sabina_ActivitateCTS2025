package main;

import clase.Calator;
import clase.IMetodaPlata;
import clase.PlataCardCalatorie;
import clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata cardCalatorie = new PlataCardCalatorie(1);

        Calator calator = new Calator("Sabina", cardCalatorie);
        calator.platesteBilet(5);

        calator.setMetodaPlata(new PlataSMS());
        calator.platesteBilet(5);

        calator.setMetodaPlata(cardCalatorie);
        calator.platesteBilet(5);
    }
}
