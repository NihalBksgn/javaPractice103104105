package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");

        String kullaniciIsmi= input.next();
        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
        //         ( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )
        System.out.println("Cemberin yaricapini giriniz");
        double r= input.nextDouble();

        System.out.println("cemberin cevresi: " +2*3.14*r);

        System.out.println("cemberin alani:" + 3.14*r*r);

        //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
        //          cevre hesabini yapan bir program yaziniz.

        System.out.println("dikdortgenin uzun ve kisa kenarini kesiniz");
        int kisa= input.nextInt();
        int uzun= input.nextInt();
        System.out.println("dikdörgenin alani:" + kisa*uzun);
        System.out.println("dikdörtgenin cevresi:" + 2*(kisa+uzun));

        //Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
        // Ucgenin cevresi=a+b+c
        System.out.println("ucgenin kenar uzunluklarini giriniz");
        byte x= input.nextByte();
        byte y= input.nextByte();
        byte z= input.nextByte();

        System.out.println("ücgenin cevresi=" + (x+y+z));

        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz

    /*
             A
            A A
           A A A
    */

        System.out.println("Bir karakter giriniz");
        char ch=input.next().charAt(0);

        System.out.println("  "+ch+ "  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch+" ");

     // 2.YOL
        System.out.println("Bir karakter giriniz");
        String chr = input.next();

        System.out.println("   "+chr +"\n" +" "+chr  +"   "+chr + "\n"+chr+"  "+chr +"  " +chr);

        }
    }

