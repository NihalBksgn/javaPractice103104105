package advanced_practice01;

import java.util.Scanner;

public class C02_Substring {
    public static void main(String[] args) {

        //Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,
        // ad ayri soyad ayri sekilde ekranda yazdiriniz

        Scanner input =new Scanner(System.in);
        System.out.println("Ad ve soyadinizi arasinda bir bosluk olacak sekilde giriniz");
        String adSoyad = input.nextLine();
        String ad = adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyad = adSoyad.substring(adSoyad.indexOf(" ")+1);
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
    }
}
