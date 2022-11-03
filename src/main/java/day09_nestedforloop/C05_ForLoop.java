package day09_nestedforloop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

// Girilen bir stringin harflerini teker teker ekrana alt alta olacak
// sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
        Scanner input =new Scanner(System.in);
        System.out.println("Bir String ifade giriniz");
        String kelime = input.next();

        for(int i=0; i<kelime.length(); i++){

            if(kelime.charAt(i)=='a'|| kelime.charAt(i)==' ' )
                continue;
                System.out.println(kelime.charAt(i));

        }


















    }
}
