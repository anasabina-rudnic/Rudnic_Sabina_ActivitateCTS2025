package Clase;

import java.util.Arrays;

public class Elev extends Aplicant {
    private int clasa;
    private String tutore;

    public Elev() {
        super();
    }

    public Elev(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public String getTutore() {
        return tutore;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }

    @Override
    public String toString() {
        return "Elev: Nume = " + nume + ", Prenume = " + prenume + ", Varsta = " + varsta
                + ", Punctaj = " + punctaj + ", Nr. proiecte = " + nrProiecte  + ", Denumire proiect = "
                + Arrays.toString(denumireProiect) + ", Clasa = " + clasa + ", Tutore = " + tutore;
    }

    public int finantare() {
        int s = 30;
        System.out.println("Elevul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
        return s;
    }
}
