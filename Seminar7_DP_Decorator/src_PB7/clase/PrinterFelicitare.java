package clase;

public abstract class PrinterFelicitare implements Nota {
    private NotaDePlata notaDePlata;

    public PrinterFelicitare(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printare() {
        notaDePlata.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
