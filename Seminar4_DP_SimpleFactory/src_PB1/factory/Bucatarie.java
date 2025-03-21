package factory;

import clase.Supa;
import clase.SupaCiuperci;
import clase.SupaLegume;
import clase.SupaVita;

public class Bucatarie {
    private int cantitate;
    private float pret;

    public Bucatarie(int cantitate, float pret) {
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public Supa getSupa(TipSupa tipSupa, boolean hasArdei, boolean hasSmantana) {
        switch (tipSupa) {
            case LEGUME -> {
                return new SupaLegume(cantitate, pret, hasArdei, hasSmantana);
            }
            case CIUPERCI -> {
                return new SupaCiuperci(cantitate, pret, hasArdei, hasSmantana);
            }
            case VITA -> {
                return new SupaVita(cantitate, pret, hasArdei, hasSmantana);
            }
            default -> {
                return null;
            }
        }
    }
}
