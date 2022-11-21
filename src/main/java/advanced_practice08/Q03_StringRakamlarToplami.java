package advanced_practice08;

import java.util.Scanner;

public class Q03_StringRakamlarToplami {
    /*
    Kullanicidan alinan bir String icerisindeki rakamlarin toplamini hesaplayan bir method yaziniz

    örn:
    input:J4\/4 1$ 34$§
    output:16

    ipucu:
    Character.isDigit()
    Integer.valueOf()
     */

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str= input.nextLine();
        int toplam=0;

        for(int i= 0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                toplam+=Integer.valueOf("" + str.charAt(i));
            }
        }
        System.out.println(toplam);
    }
}
