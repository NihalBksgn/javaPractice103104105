package advanced_practice06;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C01_RastgeleSayiMatriksi {
    /*
    Kullanicidan aldiginiz bir sayi kadar satir ve sutun sayisina sahip asagidaki gibi rastgele 0 ve 1 'lerden olusan matriksi yaziniz

    input:4
    Output:

    1 0 0 1
    0 1 1 0
    1 1 0 0
    0 1 0 1
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();

        for(int i=0; i<sayi; i++){

            for (int j = 0; j <sayi ; j++) {
                System.out.print((int)(Math.random()*2) + " ");
            }
            System.out.println();
        }




    }


}
