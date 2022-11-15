package day15_exceptionsabstraction;

import java.util.Scanner;

public class C02_TryCatchMarket {
    /*
    Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
    Kullaniciya index sorup, o indexdeki urunu yazdiran bir program yaziniz.
    (Kullanici marketteki urun sayisindan fazla sayida bir index girerse exeption vermesinin onune gecelim)
   */

    public static void main(String[] args) {


        String[]urunler={"Et","Sut","Findik","Fistik"};
        Scanner input = new Scanner(System.in);
        System.out.println("Istediginiz urunun sira numarasini giriniz");

        try {
            int index =input.nextInt();
        } catch (Exception e) {
           e.printStackTrace();
        }
        System.out.println();
    }
}
