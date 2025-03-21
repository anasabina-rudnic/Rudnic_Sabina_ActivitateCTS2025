package main;

import clase.Supa;
import factory.Bucatarie;
import factory.TipSupa;

public class Main {
    public static void main(String[] args) {
        Bucatarie bucatarie = new Bucatarie(250, 25.5f);

        Supa supaLegume1 = bucatarie.getSupa(TipSupa.LEGUME, false, true);
        Supa supaCiuperci1 = bucatarie.getSupa(TipSupa.CIUPERCI, false, false);
        Supa supaVita1 = bucatarie.getSupa(TipSupa.VITA, true, true);

        supaLegume1.afiseazaDescriere();
        supaCiuperci1.afiseazaDescriere();
        supaVita1.afiseazaDescriere();

        Bucatarie cantina = new Bucatarie(400, 10.5f);

        Supa supaLegume2 = cantina.getSupa(TipSupa.LEGUME, false, true);
        Supa supaCiuperci2 = cantina.getSupa(TipSupa.CIUPERCI, false, false);
        Supa supaVita2 = cantina.getSupa(TipSupa.VITA, true, true);

        supaLegume2.afiseazaDescriere();
        supaCiuperci2.afiseazaDescriere();
        supaVita2.afiseazaDescriere();
    }
}
