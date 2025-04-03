package fabrici;

import clase.Clatita;
import clase.FelMancare;
import clase.Papanas;

public class DesertFactory implements TipFelMancareFactory {
    private String crema;

    public DesertFactory(String crema) {
        this.crema = crema;
    }

    public void setCrema(String crema) {
        this.crema = crema;
    }

    @Override
    public FelMancare prepareFelMancare(TipFelMancare tip, float pret, int nrCalorii) {
        return switch (tip) {
            case Desert.Papanasi -> new Papanas(pret, nrCalorii, this.crema);
            case Desert.Clatite -> new Clatita(pret, nrCalorii, this.crema);
            default -> null;
        };
    }
}
