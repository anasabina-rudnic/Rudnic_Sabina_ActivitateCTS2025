package adaptorDeObiecte.clase;

public class MedicamentFarmacie {
    private String nume;
    private float pret;
    private boolean esteInStoc;
    private String dataExpirare;

    public MedicamentFarmacie(String nume, float pret, boolean esteInStoc, String dataExpirare) {
        this.nume = nume;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
        this.dataExpirare = dataExpirare;
    }

    public void cumparaMedicament() {
        System.out.println("Medicamentul " + this.nume + ", cu pretul " + this.pret + ", expira la data " + this.dataExpirare + ".");
    }
}
