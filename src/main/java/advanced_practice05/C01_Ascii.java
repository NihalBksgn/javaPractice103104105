package advanced_practice05;

import java.util.Scanner;

public class C01_Ascii {

    //Kullanicidan aldiginiz iki karakterin arasinda bulunan tum karakterleri yazdiran bir kod yaziniz
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen ilk karakteri giriniz");
        char ch1= input.next().charAt(0);

        System.out.println("Lutfen ikinci karakteri giriniz");
        char ch2= input.next().charAt(0);

        int ilk=Math.min(ch1,ch2);
        int ikinci= Math.max(ch1,ch2);

        for(int i=ilk+1; i<ikinci; i++){

            System.out.println((char)i + " ");
        }






    }
}
