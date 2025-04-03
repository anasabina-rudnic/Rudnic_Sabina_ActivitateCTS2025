package adaptorDeObiecte.main;

import adaptorDeObiecte.clase.MedicamentAdaptor;
import adaptorDeObiecte.clase.MedicamentFarmacie;
import adaptorDeObiecte.clase.MedicamentSpital;

public class Main {

    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie) {
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Paracetamol", 20, true, "13.06.2026");
        vindeMedicament(medicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Nurofen", 46);
        MedicamentAdaptor adaptor = new MedicamentAdaptor(medicamentSpital);
        vindeMedicament(adaptor);
    }
}
