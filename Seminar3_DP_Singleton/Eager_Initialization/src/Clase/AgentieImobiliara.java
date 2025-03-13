package Clase;

public class AgentieImobiliara {
    private String nume;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private AgentieImobiliara agentieImobiliara;

    private AgentieImobiliara(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public AgentieImobiliara getAgentieImobiliara() {
        return agentieImobiliara;
    }
}
