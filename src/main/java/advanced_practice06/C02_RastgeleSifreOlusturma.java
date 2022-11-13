package advanced_practice06;

import java.util.Scanner;

public class C02_RastgeleSifreOlusturma {
    //Kullanicidan aldiginiz sayi kadar karakter uzunluguna sahip rastgele sifre olusturan kodu yaziniz

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Karakter sayisini giriniz");
        int karakterSayisi = input.nextInt();

        String sifre= "";
        String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 ";
        int maxIndex=karakterler.length()-1;
        int sayac=0;

        while (sayac < karakterSayisi){

            int rastgeleIndex = (int)(Math.random()*maxIndex);
            sifre += karakterler.charAt(rastgeleIndex);
            sayac++;
        }
        System.out.println("Sifre: " + sifre);
    }
}
