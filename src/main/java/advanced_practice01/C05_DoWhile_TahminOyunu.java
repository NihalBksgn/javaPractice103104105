package advanced_practice01;

import java.util.Scanner;

public class C05_DoWhile_TahminOyunu {
    public static void main(String[] args) {
        /*
        0 ile 100arasinda rastgele numara tahmini yapan bir kod yaziniz
        ipucu: Girdiginiz numara rastgeleNumaradan kucukse ==> Daha buyuk bir numara giriniz
               Girdiginiz numara rastgeleNumaradan buyukse ==> Daha kucuk bir numara giriniz
               Girdiginiz numara rastgeleNumaraya esitse ==> Tebrikler
         */
        Scanner input = new Scanner(System.in);

        int sayi;

        int rastgeleSayi = (int) (Math.random() * 100) + 1;
        System.out.println("rastgeleSayi = " + rastgeleSayi);
        int sayac = 0;
        System.out.println("0 ile 100 arasi bir sayi tahmini giriniz");
        do {
            sayac++;

            sayi = input.nextInt();

            if (sayi == rastgeleSayi) {
                System.out.println("Tebrikler");
            } else if (sayi < rastgeleSayi) {
                System.out.println("Daha buyuk bir sayi giriniz");
            } else {
                System.out.println("Daha kucuk bir sayi giriniz");
            }
            if (sayac == 10) {
                System.out.println("Hakkiniz bitti oyunu kaybettiniz");
                break;
            }
            System.out.println(10-sayac + "hakkiniz kaldi");

        } while (sayi != rastgeleSayi);


    }
}
