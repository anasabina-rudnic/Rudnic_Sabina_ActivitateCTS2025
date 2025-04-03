package fabrici;

import clase.FelMancare;

public interface TipFelMancareFactory {
    FelMancare prepareFelMancare(TipFelMancare tip, float pret, int nrCalorii);
}
