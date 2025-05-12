package clase;

public class PlataSMS implements IMetodaPlata {

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Plata a fost facuta prin SMS");
    }
}
