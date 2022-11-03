package day09_nestedforloop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
//
//        //INTERWIEW SORUSU
//        //kullanicidan toplanmak uzere sayilar isteyin.Sayi adedi 10 u gecerse ya da toplami 500 u gecerse
//        //"Bukadar sayi yeter....adet sayi girdiniz.Toplami ......"
//
        Scanner input = new Scanner(System.in);
        int sayi = 0;
        int counter = 0;
        int toplam = 0;
        while (counter < 11 && toplam < 500) {

            System.out.println("toplanmak uzere sayi giriniz");
           sayi = input.nextInt();
            toplam+=sayi;
            counter++;
        }
        if(toplam>500){
            System.out.println(counter+ "adet sayi girdiniz.Toplami:" + toplam);

        }else{
            System.out.println("Bukadar sayi yeter. " + counter + " adet sayi girdiniz.Toplami:" + toplam);
        }
//
////        1 2 3 4 5 6
////         2 3 4 5 6
////          3 4 5 6
////           4 5 6
////            5 6
////             6
//
//
        for (int satir = 1; satir <= 6; satir++) {//satır kontrolü
            for (int bosluk = 1; bosluk < satir; bosluk++) {// boşluk yazdırma
                System.out.print(" ");
            }
            for (int rakam = satir; rakam <= 6; rakam++) {//sutun kontrolu
                System.out.print(rakam + " ");
            }
            System.out.println();
        }

    }
}
