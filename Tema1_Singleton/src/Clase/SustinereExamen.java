package Clase;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {
    private int nrCredite;
    private Map<String, Examen> examene = new HashMap<>();

    public SustinereExamen(int nrCredite) {
        this.nrCredite = nrCredite;
    }

    public Examen inregistreazaSustinereExamen(String student, String materie, String profesor, int sala, int zi, int ora) {
        Examen examen = new Examen(materie, profesor, sala, zi, ora);
        if (!examene.containsKey(student) && !(examene.get(student) == examen)) {
            examene.put(student, examen);
        } else {
            System.out.println("Studentul " + student + " a sustinut deja examentul la " + examen.getMaterie());
        }

        return examene.get(examen);
    }
}
