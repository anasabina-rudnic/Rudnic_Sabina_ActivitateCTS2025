package Eager_Initialization.Main;

import Eager_Initialization.Clase.AgentieImobiliara;

public class Main {
    public static void main(String[] args) {
        AgentieImobiliara agentieImobiliara = AgentieImobiliara.getAgentieImobiliara();
        System.out.println(agentieImobiliara.toString());

        AgentieImobiliara agentieImobiliara2 = AgentieImobiliara.getAgentieImobiliara();
        agentieImobiliara2.setSite("ai.com");
        System.out.println(agentieImobiliara.toString());
        System.out.println(agentieImobiliara2.toString());

        agentieImobiliara2.posteazaAnunt("Anunt 1");
        System.out.println(agentieImobiliara.toString());
        System.out.println(agentieImobiliara2.toString());
    }
}
