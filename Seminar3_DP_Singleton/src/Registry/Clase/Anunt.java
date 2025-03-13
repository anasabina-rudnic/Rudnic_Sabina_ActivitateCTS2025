package Registry.Clase;

public class Anunt {
    private String adresa;
    private String proprietar;
    private int nrCamere;
    private int nrAnunt;

    protected Anunt(String adresa, String proprietar, int nrCamere, int nrAnunt) {
        this.adresa = adresa;
        this.proprietar = proprietar;
        this.nrCamere = nrCamere;
        this.nrAnunt = nrAnunt;
    }

    @Override
    public String toString() {
        return "Anuntul numarul " + nrAnunt + " are proprietarul " + proprietar + ", are adresa " + adresa
                + " si are " + nrCamere + " camere.";
    }
}
