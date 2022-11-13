package advanced_practice06;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class C05_Inheritance_HacimHesaplama {

        //Kare prizma, silindir, ve koninin hacmini hesaplayan bir kod yaziniz.(Inheritance kullaniniz)

    public static void main(String[] args) {

        KarePrizma karePrizma = new KarePrizma();
        double karePrizmaHacmi = karePrizma.hacimHesapla(5,6);
        System.out.println(karePrizmaHacmi);


        Koni koni =new Koni();
        double koniHacmi = koni.hacimHesapla(3,5);
        NumberFormat obj = new DecimalFormat(".00");
        System.out.println(obj.format(koniHacmi));

        Silindir silindir = new Silindir();
        double silindirHacmi = silindir.hacimHesapla(1,5);
        System.out.println(obj.format(silindirHacmi));


    }
}
