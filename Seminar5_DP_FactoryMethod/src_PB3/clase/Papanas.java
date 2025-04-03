package clase;

public class Papanas extends FelMancare {
    private String crema;

    public Papanas(float pret, int nrCalorii, String crema) {
        super(pret, nrCalorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Papanas: ");
        sb.append("crema - ").append(crema);
        sb.append(".");
        return sb.toString();
    }
}
