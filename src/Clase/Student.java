package Clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;

    public Student() {
        super();
    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
        super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAnStudii() {
        return anStudii;
    }

    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }

    @Override
    public String toString() {
        return "Student: Nume = " + nume + ", Prenume =" + prenume + ", Varsta =" + varsta
                + ", Punctaj =" + punctaj + ", Nr. proiecte =" + nrProiecte +  ", Denumire proiect ="
                + Arrays.toString(denumireProiect) + "Facultate =" + facultate + ", An studii=" + anStudii ;
    }

    public int finantare() {
        int s = 20;
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
        return s;
    }
}
