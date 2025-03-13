package Clase;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumireProiect;
    private static final int punctajMinim = 80;

    public Aplicant() {
        super();
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }

    public void setNrProiecte(int nrProiecte, String[] denumireProiect) {
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect;
    }

    public void afisareStatut() {
        StringBuilder sb = new StringBuilder("Aplicantul ").append(nume).append(" ").append(prenume);
        sb.append(punctaj > punctajMinim ? " a fost acceptat." : " nu a fost acceptat.");

        System.out.println(sb);
    }
}
