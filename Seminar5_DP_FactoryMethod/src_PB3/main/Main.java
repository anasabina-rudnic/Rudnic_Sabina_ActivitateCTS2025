package main;

import clase.FelMancare;
import fabrici.*;

public class Main {
    public static void main(String[] args) {
        TipFelMancareFactory fabricaDeSupe = new SupaFactory(450);

        FelMancare supa1 = fabricaDeSupe.prepareFelMancare(Supa.SupaCiuperci,30,400);
        FelMancare supa2 = fabricaDeSupe.prepareFelMancare(Supa.SupaLegume, 20, 300);

        System.out.println(supa1.toString());
        System.out.println(supa2.toString());

        TipFelMancareFactory fabricaDeDeserturi = new DesertFactory("Nutella");

        FelMancare desert1 = fabricaDeDeserturi.prepareFelMancare(Desert.Papanasi,39,900);
        FelMancare desert2 = fabricaDeDeserturi.prepareFelMancare(Desert.Clatite,29,500);

        System.out.println(desert1.toString());
        System.out.println(desert2.toString());
    }
}
