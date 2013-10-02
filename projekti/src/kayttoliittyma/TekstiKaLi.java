package kayttoliittyma;

import java.util.Scanner;
import logiikka.Pelilauta;
import logiikka.*;
import tiedosto.Tiedosto;

public class TekstiKaLi {

    Scanner lukija;
    Pelilauta pelilauta;

    public TekstiKaLi(Scanner l, Pelilauta p) {
        lukija = l;
        pelilauta = p;
    }

    public void kaynnista() {
        int koodinPituus = 3;
        int arvaustenLkm = 5;
        int eriMerkkeja = 5;

        menu();

        System.out.println("Koodin pituus [" + koodinPituus + "], Arvausten lukumäärä [" + arvaustenLkm + "],  koodi koostuu merkeista [0 - " + eriMerkkeja + "]");

        pelilauta = new Pelilauta(koodinPituus, eriMerkkeja, arvaustenLkm);

        System.out.println("");
        while (pelilauta.onkoArvauksiaJaljella()) {
            System.out.println("Arvaa koodi : ");

            String s = lukija.next();
            if (s.equals("q")) {
                break;
            }
            if (s.equals("t")) {
                Tiedosto t = new Tiedosto();
                try {
                    t.talletaPeli("peli.dat", pelilauta);
                } catch (Exception e) {
                    System.out.println(e.toString());
                    break;
                }
                System.out.println("Talletettu!");
                continue;
            }
            if (s.equals("l")) {
                Tiedosto l = new Tiedosto();
                try {
                    pelilauta = l.lataaPeli("peli.dat");
                    System.out.println("Edelliset arvaukset");
                    System.out.println(pelilauta.getRivit());
                } catch (Exception e) {
                    System.out.println(e.toString());
                    break;
                }
                System.out.println("Ladattu!");
                continue;
            }

            //Siirretetty luokkaan SyoteTaulukoksi
//            try {
//                if (s.startsWith("-")){
//                    throw new Exception("Miinusmerkki / Tavuviiva ei käy!");
//                } 
//                if (s.length()!=koodinPituus){
//                    throw new Exception("Anna täsmälleen "+koodinPituus+" merkkiä");
//                }
//                
//                Integer.parseInt(s);
//                
//                
//            }catch (NumberFormatException ex){
//                System.out.println("Ei käy! Anna vain numeroita");
//                System.out.println("");
//                continue;
//                
//            } catch (Exception e) {
//                System.out.println("Virhe! : "+e.getMessage());
//                System.out.println("");
//                continue;
//            }
//
//            int[] arvaus = new int[koodinPituus];
//
//            for (int i = 0; i < s.length(); i++) {
//                if (i == koodinPituus) {
//                    break;
//                }
//                StringBuilder sb = new StringBuilder();
//                sb.append(s.charAt(i));
//                arvaus[i] = Integer.parseInt(sb.toString());
//            }

            SyoteTaulukoksi st = new SyoteTaulukoksi();
            st.setMaxNro(eriMerkkeja);

            if (!st.validoiSyote(s, koodinPituus)) {
                System.out.println(st.getViesti());
                System.out.println("");
                continue;
            }

            Komento k = new ArvaaKoodi(st.getKoodi(), pelilauta);
            k.suorita();
            Rivi r = pelilauta.annaViimeisinRivi();
            System.out.println(r);
            System.out.println(r.getOikeinLkm() + " oikealla paikalla ja " + r.getMukanaLkm() + " oikeaa merkkiä");
            System.out.println("");

        }

        if (pelilauta.getOnkoRatkaistu()) {
            System.out.println("Hienoa! Ratkaisu löytyi");
        } else if (!pelilauta.onkoArvauksiaJaljella()) {
            System.out.println("Arvaukset käytetty!");
            naytaKoodi();
        }
    }

    private void menu() {
        System.out.println("********************");
        System.out.println(" XArvausPeli (MasterMind)");
        System.out.println("");
        System.out.println("(q - kirjain lopettaa)");
        System.out.println("(t - tallettaa)");
        System.out.println("(l - kirjain lataa)");
        System.out.println("*********************");

    }

    private void naytaKoodi() {
        int[] koodi = pelilauta.getKoodi();

        System.out.println(" -- Oikea Koodi on -- ");
        for (int i : koodi) {
            System.out.print(i);
        }
        System.out.println("");

    }
}
