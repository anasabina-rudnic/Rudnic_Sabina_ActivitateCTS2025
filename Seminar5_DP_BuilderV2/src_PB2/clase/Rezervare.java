package clase;

public class Rezervare {
    private String numeClient;
    private Boolean asezareGeam;
    private Boolean scuaneErgonomice;
    private Boolean decorareMasa;
    private String genMuzica;

    protected Rezervare(String numeClient, Boolean asezareGeam, Boolean scuaneErgonomice, Boolean decorareMasa, String genMuzica) {
        this.numeClient = numeClient;
        this.asezareGeam = asezareGeam;
        this.scuaneErgonomice = scuaneErgonomice;
        this.decorareMasa = decorareMasa;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare: ");
        sb.append("nume client - ").append(numeClient);
        sb.append(", asezare geam - ").append(asezareGeam);
        sb.append(", scuane ergonomice - ").append(scuaneErgonomice);
        sb.append(", decorare masa - ").append(decorareMasa);
        sb.append(", gen muzica - ").append(genMuzica);
        sb.append(".");
        return sb.toString();
    }
}
