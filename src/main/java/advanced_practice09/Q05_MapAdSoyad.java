package advanced_practice09;

import java.util.HashMap;

public class Q05_MapAdSoyad {
    /*
    Iki farkli Array'de ayni indexte barindirilan ad ve soyadlari örnekteki gibi yazdiran bir kod yaziniz
    input: {"John","Mark","Ali"};  {"Doe","Twain","Can"};
    output: {John=Doe,Mark=Twain,Ali=Can};
     */

    public static void main(String[] args) {
        String[] ad = {"John", "Mark", "Ali"};
        String[] soyad = {"Doe", "Twain", "Can"};

        HashMap<String, String> adsoyad = new HashMap<>();
        for (int i = 0; i < ad.length; i++) {
            adsoyad.put(ad[i], soyad[i]);
        }
        System.out.println(adsoyad);
    }
}
