package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        //Soru 1:Kullanicinin girdigi dört basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran kodu yazin
        Scanner input=new Scanner(System.in);
        System.out.println("Dört basamakli bir sayi giriniz");

        int sayi=input.nextInt();

        //Bir sayinin birler basamagindaki rakami mod 10 (%10) ile hesaplatabiliriz.
        int sonRakam=sayi%10;
        int ilkRakam=sayi/1000;

        System.out.println("ilk rakam + son rakam:" + (ilkRakam+sonRakam));


        //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
    /* Ornek : Inputs : 853
    Output : Girdiginiz sayinin birler basamagi : 3
             Girdiginiz sayinin onlar basamagi : 5
             Girdiginiz sayinin yuzler basamagi : 8
    */

        System.out.println("uc basamakli bir sayi giriniz");
        int sayi1= input.nextInt();
        int birlerBasamagi=sayi1%10;
//        int yeniSayi=sayi1/10;           //  sayi1/= 10;
//        int onlarBasamagi=yeniSayi%10;
//        int yeniSayi2=yeniSayi/10;
//        int yuzlerBasamagi=yeniSayi2%10;

        //2.yol:
        sayi1/=10;
        int onlarBasamagi=sayi1%10;
        sayi1/=10;
        int yuzlerBasamagi=sayi1%10;


        System.out.println("birlerBasamagi = " + birlerBasamagi);
        System.out.println("onlarBasamagi = " + onlarBasamagi);
        System.out.println("yüzlerBasamagi = " + yuzlerBasamagi);

        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz

        System.out.println("Bes basamakli bir sayi giriniz...");
        int nummer= input.nextInt();

        int birler=nummer%10;
        int onlar=(nummer/10)%10;
        int binler=(nummer/1000)%10;
        int onBinler=nummer/10000;

        int toplam=binler+birler+onlar+onBinler;
        System.out.println("ilk iki ve son iki basamagin toplami= "+ toplam);








    }
}
