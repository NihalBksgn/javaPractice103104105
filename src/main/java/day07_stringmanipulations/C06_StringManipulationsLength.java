package day07_stringmanipulations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C06_StringManipulationsLength {
    public static void main(String[] args) {

/**
 * Length()
 * length() method'u girilen String'in uzunlugunu verir
 * butun karakterlerin adedi (bosluklar da birer karakterdir)
 */

        String cumle = "Bugun hava yagmurlu";
        System.out.println(cumle.length());//19

        String str1 = "";
        System.out.println(str1.length());//0

        String str2 = " ";
        System.out.println(str2.length());


        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = input.next();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = input.next();

        if (isim.length() > soyIsim.length()) {
            System.out.println("isim daha uzun");
        } else if (isim.length() == soyIsim.length()) {
            System.out.println("Isminiz soy isminizle ayni uzunlukta");
        } else {
            System.out.println("soyisim daha uzun");
        }

        //Kullanicidan 4harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        String kelime="Idil";
        String ters="";



        if(kelime.length()==4){
            String a=kelime.substring(0,1);
            String b=kelime.substring(1,2);
            String c = kelime.substring(2,3);
            String d= kelime.substring(3,4);
            System.out.println("ters yazilmis hali:" + d + c + b + a );

        }else if (kelime.length()<4){
            System.out.println("girdiginiz kelime 4 harften kisa");

        }



    }
}
