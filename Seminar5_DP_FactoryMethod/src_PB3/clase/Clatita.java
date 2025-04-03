package clase;

public class Clatita extends FelMancare {
    private String crema;

    public Clatita(float pret, int nrCalorii, String crema) {
        super(pret, nrCalorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clatita: ");
        sb.append("crema - ").append(crema);
        sb.append(".");
        return sb.toString();
    }
}
