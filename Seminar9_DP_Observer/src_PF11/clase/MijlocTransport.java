package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subject {
    private int numarLinie;
    private List<Observer> calatori;

    public MijlocTransport(int numarLinie) {
        this.numarLinie = numarLinie;
        this.calatori = new ArrayList<Observer>();
    }

    public int getNumarLinie() {
        return numarLinie;
    }

    public List<Observer> getCalatori() {
        return calatori;
    }

    public void adaugaObserver(Observer observer) {
        this.calatori.add(observer);
    }
    public void stergeObserver(Observer observer) {
        this.calatori.remove(observer);
    }
    public void trimiteMesaj(String mesaj) {
        for (Observer catalor : calatori) {
            catalor.primesteMesaj(mesaj);
        }
    }

    public abstract void pleacaDeLaCapat();
}
