package clase;

public interface IBuilder {
    Rezervare buildRezervare();

    IBuilder setNumeClient(String numeClient);
    IBuilder setAsezareGeam(Boolean asezareGeam);
    IBuilder setScuaneErgonomice(Boolean scuaneErgonomice);
    IBuilder setDecorareMasa(Boolean decorareMasa);
    IBuilder setGenMuzica(String genMuzica);
}
