package day03_ifStatement;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {

        char harf='a';
        char harf2='A';

        System.out.println("harf>harf2==>"+(harf>harf2));
        //Karsilastirma islemlerinin sonucunu true ya da false (yani boolean) doner.
        //Buyuk harflerin ASCII degerleri kucuk harflerin Ascii degerlerinden kucuktur

        //Example1: Herhangi bir char variablenin Ascii degerlerini kod yazarak bulunuz.

        char space=' ';
        System.out.println("Space'nin ASCII Degeri:"+ (0 + space));
        //32  Space'nin Ascii degerini hesaplamak icin toplamaya etkisi olmayan sifiri seceriz.
        //    böylece yazdirdigimiz deger bize Space'in Ascii degerini verir.

        // 1. yol:
        char harf1='m';
        System.out.println("m'nin ascii degeri:"+(harf1 + 0));

        //2.yol:
        int harf3='m';
        System.out.println("m'nin ascii degeri = " + harf3);

        // char'larda java char karaktere integer da atayabiliriz.cunku char'in bir resim karakteri
        // bir de ascii(sayisal) degeri vardir.Bu nedenle ASCII degerlerini hesaplayabiliriz

        //Example 2: byte b1 ve byte b2 degerlerini kiyaslayin

        byte b1=12;
        byte b2=-125;

        System.out.println("b1>b2==>"+ (b1>b2));//true

        float f1= 2.45645f;
        float f2= 5.86786F;

        System.out.println("f1>f2==>" + (f1>f2));//false
        System.out.println("b1>f1==>" + (b1>f1));//true

        long lng1=54564654L;
        System.out.println("b1<lng1==>" + (b1<lng1));//true

        char ch='h';
        System.out.println("b1>ch==>" + (b1>ch));//false

    }
}
