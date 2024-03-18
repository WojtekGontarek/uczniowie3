public interface Komputer extends Comparable<Komputer> {

    default void uruchom(){

    }
    default void zepsujSie(){

    }

    @Override
    default int compareTo(Komputer o) {
        String nazwa = getClass().getName();
        String nazwa2 = o.getClass().getName();
        return nazwa.length() - nazwa2.length();
    }
}
