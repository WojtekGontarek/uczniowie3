public class KomputerMac implements Komputer{
    private String procesor;

    private String zasilacz;

    private String kabaczek;

    public KomputerMac(String procesor, String zasilacz, String kabaczek) {
        this.procesor = procesor;
        this.zasilacz = zasilacz;
        this.kabaczek = kabaczek;
    }
}
