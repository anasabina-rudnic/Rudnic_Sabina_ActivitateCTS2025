package Clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;

    public Angajat() {
        super();
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte,int salariu,String ocupatie) {
        super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Angajat: Nume = " + nume + ", Prenume = " + prenume + ", Varsta = " + varsta
                + ", Punctaj =" + punctaj + ", Nr proiecte = " + nrProiecte + ", Denumire proiect = "
                + Arrays.toString(denumireProiect) + ", Ocupatie = " + ocupatie + ", Salariu = " + salariu;
    }


    public int finantare() {
        int s = 10;
        System.out.println("Angajatul "+ getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
        return s;
    }
}
