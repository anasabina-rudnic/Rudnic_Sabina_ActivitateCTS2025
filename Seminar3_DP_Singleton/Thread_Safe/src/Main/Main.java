package Main;

import Clase.AgentieImobiliara;
import Clase.Anunt;

public class Main {
    public static void main(String[] args) {
        AgentieImobiliara agentieImobiliara = new AgentieImobiliara("Imobiliare", 150000);

        Anunt anunt = agentieImobiliara.posteazaAnunt("Piata Romana 6", "Popescu Viorel", 2);
        Anunt anunt1 = agentieImobiliara.posteazaAnunt("Bd. Universitatii 359", "Ionescu Maria", 3);
        Anunt anunt2 = agentieImobiliara.posteazaAnunt("Piata Romana 6", "Vasilescu Marian", 2);

        System.out.println(anunt);
        System.out.println(anunt1);
        System.out.println(anunt2);
    }
}
