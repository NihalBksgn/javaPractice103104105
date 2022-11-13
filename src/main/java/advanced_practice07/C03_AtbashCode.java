package advanced_practice07;

import java.util.Scanner;

public class C03_AtbashCode {
/*
      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
      Örn: A-->Z, B-->Y ...
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";
     */
public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("bir cummle giriniz");
    String cumle= input.nextLine();

    //1.Yol

    String str2="zyxwvutsrqponmlkjihgfedcba";
    String str1="abcdefghijklmnopqrstuvwxyz";

    for (int i = 0; i < cumle.length(); i++) {
        for (int j = 0; j < str1.length(); j++) {
            if(cumle.charAt(i)==str1.charAt(j)){
                System.out.print(str2.charAt(j));
            }
        }
    }

    //2.Yol:

}
}
