package kayttoliittyma;

/**
 * Ohjelman käynnistys
 */
import java.util.Scanner;
import logiikka.Pelilauta;

public class XarvausPeli {

    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);
        Pelilauta p = new Pelilauta();

        System.out.println("STARTTAA TextUI = t ; muu nappi = GraphUI ?");

        if (l.next().equals("t")) {
            TekstiKaLi kl = new TekstiKaLi(l, p);
            kl.kaynnista();
        } else {
            System.out.println("START GraphUI");

            GrafiikkaKaLi g = new GrafiikkaKaLi();
            g.kaynnista();
        }
    }
}
