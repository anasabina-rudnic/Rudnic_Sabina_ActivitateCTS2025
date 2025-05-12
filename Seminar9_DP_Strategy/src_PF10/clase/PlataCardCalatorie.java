package clase;

public class PlataCardCalatorie implements IMetodaPlata {
    private int nrCalatorii;

    public PlataCardCalatorie(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void plateste(float pretBilet) {
        if (nrCalatorii > 0) {
            System.out.println("Plata a fost facuta cu cardul de calatorii");
            nrCalatorii -= 1;
        } else {
            System.out.println("Nu mai sunt calatorii disponibile pe card");
        }
    }
}
