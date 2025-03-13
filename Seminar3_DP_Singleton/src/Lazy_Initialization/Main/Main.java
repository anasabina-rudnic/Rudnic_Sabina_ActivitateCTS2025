package Lazy_Initialization.Main;

import Lazy_Initialization.Clase.AgentieImobiliara;

public class Main {
    public static void main(String[] args) {
        AgentieImobiliara agentieImobiliara = AgentieImobiliara.getAgentieImobiliara("Agentie Lazy", 5, "lazy.ro", 1000);
        AgentieImobiliara agentieImobiliara2 = AgentieImobiliara.getAgentieImobiliara("Agentie", 10, "agentie.ro", 50000);

        System.out.println(agentieImobiliara);
        System.out.println(agentieImobiliara2);
    }
}
