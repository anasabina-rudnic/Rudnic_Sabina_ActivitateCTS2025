package Readers;

import Clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class BaseReader {
    private final String numeFisier;

    public BaseReader(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public String getNumeFisier() {
        return numeFisier;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    protected void citireAplicant(Aplicant aplicant, Scanner input) {
        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nr = input.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNrProiecte(nr,vect);
    }
}
