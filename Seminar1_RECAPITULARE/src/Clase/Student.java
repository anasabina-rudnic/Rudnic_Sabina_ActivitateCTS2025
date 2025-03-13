package Clase;

public class Student extends Persoana {
    private int id;
    private float aniStudiu;

    public Student(String nume, int varsta, int id, float aniStudiu) {
        super(nume, varsta);
        this.id = id;
        this.aniStudiu = aniStudiu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAniStudiu() {
        return aniStudiu;
    }

    public void setAniStudiu(float aniStudiu) {
        this.aniStudiu = aniStudiu;
    }

    @Override
    public void afiseazaMetodaInvatare() {
        StringBuilder sb = new StringBuilder("Studentul ");
        sb.append(super.nume);
        sb.append(" are ");
        sb.append(this.aniStudiu);
        sb.append(" ani de studiu.");
        System.out.println(sb);
    }
}
