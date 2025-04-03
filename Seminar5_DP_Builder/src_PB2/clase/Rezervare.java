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

    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    protected void setAsezareGeam(Boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    protected void setScuaneErgonomice(Boolean scuaneErgonomice) {
        this.scuaneErgonomice = scuaneErgonomice;
    }

    protected void setDecorareMasa(Boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    protected void setGenMuzica(String genMuzica) {
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
