package Main;

import Clase.Examen;
import Clase.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        SustinereExamen sustinereExamen = new SustinereExamen(5);

        Examen examen1 = sustinereExamen.inregistreazaSustinereExamen("Rudnic", "CTS", "Zamfiroiu", 2102, 10, 12);
        Examen examen2 = sustinereExamen.inregistreazaSustinereExamen("Popescu", "POO", "Boja", 2201, 15, 7);
        Examen examen3 = sustinereExamen.inregistreazaSustinereExamen("Ionescu", "Java", "Furuna", 1201, 20, 16);

        System.out.println(examen1);
        System.out.println(examen2);
        System.out.println(examen3);
    }
}
