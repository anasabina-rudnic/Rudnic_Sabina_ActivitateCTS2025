package clase;

public abstract class Supa {
    private int cantitate;
    private float pret;
    private boolean hasArdei;
    private boolean hasSmantana;

    public Supa(int cantitate, float pret, boolean hasArdei, boolean hasSmantana) {
        this.cantitate = cantitate;
        this.pret = pret;
        this.hasArdei = hasArdei;
        this.hasSmantana = hasSmantana;
    }

    public int getCantitate() {
        return cantitate;
    }

    public float getPret() {
        return pret;
    }

    public boolean isHasArdei() {
        return hasArdei;
    }

    public boolean isHasSmantana() {
        return hasSmantana;
    }

    public abstract void afiseazaDescriere();
    public abstract float calculeazaPretFinal();
}
