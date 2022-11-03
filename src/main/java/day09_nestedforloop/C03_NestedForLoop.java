package day09_nestedforloop;

import java.util.Scanner;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun
    /* tac uzunlugu -> 6 iken

       ^
       ^^
       ^^^
       ^^^^
       ^^^^^
       ^^^^^^
       |||
       |||
       |||
       |||
       |||


*/
        Scanner input = new Scanner(System.in);
        System.out.println("Agacin tac uzunlugunu giriniz");
        int tac = input.nextInt();

        String yaprak = "";
        int gövde = 5;

        for (int i = 0; i <= tac; i++) {
            yaprak = yaprak + "^";
            System.out.println(yaprak);
        }
        for (int i = 0; i < gövde; i++) {
            System.out.println("|||");

        }
    }
}
