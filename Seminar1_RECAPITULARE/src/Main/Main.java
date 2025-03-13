package Main;

import Clase.*;
import Interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu", 21, 1, 2));
        studenti.add(new Student("Ionescu", 22, 2, 3));

        IPredabil profesor = new Profesor("Gigel", 38, 1, 12);

        Curs curs = new Curs("CTS", 5, profesor, studenti);

        curs.sustineExamen();

        IPredabil asistent = new Asistent("Marinel", 26, 2, 2);
        curs.setCadruDidactic(asistent);

        ((Persoana)curs.getCadruDidactic()).afiseazaMetodaInvatare();

        curs.sustineExamen();
    }
}
