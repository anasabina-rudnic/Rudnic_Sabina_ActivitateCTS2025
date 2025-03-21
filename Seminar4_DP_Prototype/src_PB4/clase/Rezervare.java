package clase;

public class Rezervare extends ARezervare {
    protected boolean isInterior;

    public Rezervare() {
        super();
        isInterior = true;
    }

    public Rezervare(String nume, int ora, int zi, int nrPersoane, boolean isInterior) {
        super(nume, ora, zi, nrPersoane);
        this.isInterior = isInterior;
    }

    @Override
    public String toString() {
        return "Rezervarea pe numele " + nume + " de " + nrPersoane + " persoane este in interior(" + isInterior
                + "), in ziua " + zi + ", la ora " + ora;
    }

    @Override
    public ARezervare clone(int zi) {
        Rezervare rezervare = new Rezervare();
        rezervare.nume = this.nume;
        rezervare.ora = this.ora;
        if (zi < 1 && zi > 31) {
            rezervare.zi = this.zi;
        } else {
            rezervare.zi = zi;
        }
        rezervare.nrPersoane = this.nrPersoane;
        rezervare.isInterior = this.isInterior;
        return rezervare;
    }
}
