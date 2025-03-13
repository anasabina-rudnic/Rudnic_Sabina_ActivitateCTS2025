package Clase;

import Interfete.IPersoana;
import Interfete.IPredabil;

import java.util.List;

public class Curs {
    private String numeCurs;
    private int nrCredite;
    private IPredabil cadruDidactic;
    private List<Student> studenti;

    public Curs(String numeCurs, int nrCredite, IPredabil cadruDidactic, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.nrCredite = nrCredite;
        this.cadruDidactic = cadruDidactic;
        this.studenti = studenti;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getNrCredite() {
        return nrCredite;
    }

    public void setNrCredite(int nrCredite) {
        this.nrCredite = nrCredite;
    }

    public IPredabil getCadruDidactic() {
        return cadruDidactic;
    }

    public void setCadruDidactic(IPredabil cadruDidactic) {
        this.cadruDidactic = cadruDidactic;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void sustineExamen() {
        StringBuilder sb = new StringBuilder("Cadrul didactic ");
        sb.append(((IPersoana)this.cadruDidactic).getNume());
        sb.append(" are examen la materia ");
        sb.append(this.getNumeCurs());
        sb.append(", cu urmatorii studenti: ");
        System.out.println(sb);

        for (Student student : studenti) {
            System.out.println(student.getNume());
        }
    }
}
