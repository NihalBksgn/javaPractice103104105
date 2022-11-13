package advanced_practice05;

import java.util.Scanner;

public class C02_NestedFor_Ucgen {

    /*
    Kullanicidan aldiginiz satir sasiyisina gore asagidaki sekli yazdiran bir kod yaziniz
                        *
                       * *
                      * * *
                     * * * *
                    * * * * *
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir= input.nextInt();

        for(int i=0; i<satir; i++){ //satir kontrolu

            for(int bosluk=satir-i; bosluk>1; bosluk--){
                System.out.print(" ");
            }

            for (int yildiz=0; yildiz<=i; yildiz++){
                System.out.print("* ");
            }
            System.out.println();
        }








    }
}
