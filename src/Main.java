import java.util.ArrayList;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Komputer> komputery = new ArrayList<>();
        komputery.add(new KomputerWindows("df","sad","asd"));
        komputery.add(new KomputerWindows("dfdfd","dffdf","dffdfd"));
        komputery.add(new KomputerWindows("asdf","asdf","asdf"));
        komputery.add(new KomputerMac("dfsasdfasfd","sdasfdafd","dsafdsfds"));
        komputery.add(new KomputerMac("asdafdsfds","asdfasdfsdf","dfdfd"));
        komputery.add(new KomputerMac("asdfasdf","asdfasdf","asdfasdf"));
        Collections.sort(komputery);
        System.out.println(komputery);
    }


}