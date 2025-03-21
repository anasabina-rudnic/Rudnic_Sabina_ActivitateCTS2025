package clase;

public abstract class ARezervare {
    protected String nume;
    protected int ora;
    protected int zi;
    protected int nrPersoane;

    protected ARezervare() {
        this.nume = "Client";
        this.ora = 10;
        this.zi = 1;
        this.nrPersoane = 1;
    }

    protected ARezervare(String nume, int ora, int zi, int nrPersoane) {
        if (nume.length() < 3) {
            this.nume = "Client";
        } else {
            this.nume = nume;
        }
        if (ora < 10 && ora > 22) {
            this.ora = 10;
        } else {
            this.ora = ora;
        }
        if (zi < 1 && zi > 31) {
            this.zi = 1;
        } else {
            this.zi = zi;
        }
        this.nrPersoane = nrPersoane;
    }

    public abstract ARezervare clone(int zi);
}
