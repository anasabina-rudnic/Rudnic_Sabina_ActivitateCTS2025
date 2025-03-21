package clase;

public class SupaVita extends Supa {
    private static int discount;

    public SupaVita(int cantitate, float pret, boolean hasArdei, boolean hasSmantana) {
        super(cantitate, pret, hasArdei, hasSmantana);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de vita are " + super.getCantitate() + " grame si costa " + super.getPret() + " lei.");
    }

    @Override
    public float calculeazaPretFinal() {
        return super.getPret() - super.getPret()*discount;
    }
}
