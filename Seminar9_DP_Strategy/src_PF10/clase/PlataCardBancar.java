package clase;

public class PlataCardBancar implements IMetodaPlata {
    private float sold;

    public PlataCardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if (sold >= pretBilet) {
            System.out.println("Plata a fost facuta cu cardul bancar");
            sold -= pretBilet;
        } else {
            System.out.println("Nu mai sunt bani disponibili pe card");
        }
    }
}
