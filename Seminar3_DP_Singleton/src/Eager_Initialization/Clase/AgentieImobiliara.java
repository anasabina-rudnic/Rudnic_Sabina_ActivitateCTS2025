package Eager_Initialization.Clase;

public class AgentieImobiliara {
    private String nume;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliara agentieImobiliara = new AgentieImobiliara("Agentie", 10, "agentie.com", 12000);

    private AgentieImobiliara(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public static AgentieImobiliara getAgentieImobiliara() {
        return agentieImobiliara;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void posteazaAnunt(String anunt) {
        this.nrAnunturi ++;
    }

    @Override
    public String toString() {
        return "Agentia imobiliara " + nume + " are " + nrAnunturi + " anunturi pe site-ul " + site
                + " si o cifra de afaceri de " + cifraAfaceri + " lei.";
    }
}
