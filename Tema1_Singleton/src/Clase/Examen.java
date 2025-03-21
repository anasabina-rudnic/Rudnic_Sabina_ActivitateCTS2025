package Clase;

public class Examen {
    private String materie;
    private String profesor;
    private int sala;
    private int zi;
    private int ora;

    protected Examen(String materie, String profesor, int sala, int zi, int ora) {
        this.materie = materie;
        this.profesor = profesor;
        this.sala = sala;
        this.zi = zi;
        this.ora = ora;
    }

    public String getMaterie() {
        return materie;
    }

    @Override
    public String toString() {
        return "Examenul la " + materie + " este cu profesorul " + profesor + ", in sala " + sala
                + ", in ziua " + zi + ", la ora " + ora + ".";
    }
}
