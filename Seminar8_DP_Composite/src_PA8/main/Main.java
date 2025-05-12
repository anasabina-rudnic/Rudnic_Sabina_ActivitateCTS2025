package main;

import clase.Departament;
import clase.Sectie;
import clase.StructuraAbs;

public class Main {
    public static void main(String[] args) {
        StructuraAbs departament1 = new Departament("Chirurgie", 10);
        StructuraAbs departament2 = new Departament("Pediatrie", 20);
        StructuraAbs departament3 = new Departament("Dermatologie", 15);

        StructuraAbs sectie1 = new Sectie("Chirurgie estetica", 25);
        StructuraAbs sectie2 = new Sectie("Chirurgie neuronala", 9);
        StructuraAbs sectie3 = new Sectie("Imagistica", 12);

        departament1.adaugaNod(departament2);
        departament1.adaugaNod(sectie1);
        departament1.adaugaNod(sectie2);
        departament2.adaugaNod(sectie3);

        System.out.println(departament1.calculeazaNrAngajati());
        System.out.println("-----------------------");
        System.out.println(departament2.calculeazaNrAngajati());
        System.out.println("-----------------------");
        departament1.afiseazaDescriere("");

    }
}
