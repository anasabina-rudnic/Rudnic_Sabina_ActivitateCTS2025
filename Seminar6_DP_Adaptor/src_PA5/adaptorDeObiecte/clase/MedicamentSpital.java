package adaptorDeObiecte.clase;

public class MedicamentSpital {
    private String nume;
    private float pret;

    public MedicamentSpital(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("A fost achizitionat medicamentul " + this.nume + ", la pretul " + this.pret + ".");
    }

    public void prezintaReteta() {
        System.out.println("A fost prezentata reteta pentru medicamentul " + this.nume + ".");
    }
}
