package clase;

public class NotaDePlataRevelion extends PrinterFelicitare {
    public NotaDePlataRevelion (NotaDePlata notaDePlata) {
        super(notaDePlata);
    }
    @Override
    protected void printareFelicitare() {
        System.out.println("La Multi Ani!");
    }
}
