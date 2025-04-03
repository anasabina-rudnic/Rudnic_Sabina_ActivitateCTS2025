package adaptorDeObiecte.clase;

public class MedicamentAdaptor extends MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public MedicamentAdaptor(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume(), medicamentSpital.getPret(), true, "24.02.2028");
        this.medicamentSpital = medicamentSpital;
    }

    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
