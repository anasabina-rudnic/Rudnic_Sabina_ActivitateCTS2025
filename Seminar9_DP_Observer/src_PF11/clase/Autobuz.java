package clase;

public class Autobuz extends MijlocTransport {
    public Autobuz(int numarLinie) {
        super(numarLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
        trimiteMesaj("Autobuzul numarul " + this.getNumarLinie() + " a plecat de la capat");
    }

    public void schimbaTraseu() {
        trimiteMesaj("Autobuzul numarul " + this.getNumarLinie() + " va circula astazi Bd. Balcescu si nu va mai opri la scatia P-ta Romana");
    }
}
