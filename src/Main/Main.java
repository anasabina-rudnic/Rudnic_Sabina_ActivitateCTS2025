package Main;

import Clase.Aplicant;
import Readers.AngajatiReader;
import Readers.BaseReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        BaseReader baseReader = new AngajatiReader("angajati.txt");
        try {
            listaAplicanti = baseReader.citireAplicant();
            for(Aplicant aplicant : listaAplicanti) {
                System.out.println(aplicant.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
