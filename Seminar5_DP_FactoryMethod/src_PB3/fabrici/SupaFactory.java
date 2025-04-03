package fabrici;

import clase.FelMancare;
import clase.SupaCiuperci;
import clase.SupaLegume;

public class SupaFactory implements TipFelMancareFactory {
    private int cantitate;

    public SupaFactory(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitte(int cantitate) {
        this.cantitate = cantitate;
    }


    @Override
    public FelMancare prepareFelMancare(TipFelMancare tip, float pret, int nrCalorii) {
        return switch(tip){
            case Supa.SupaCiuperci -> new SupaCiuperci(pret, nrCalorii, this.cantitate) ;
            case Supa.SupaLegume ->  new SupaLegume( pret, nrCalorii,this.cantitate);
            default -> null;
        };
    }
}
