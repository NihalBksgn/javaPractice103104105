package advanced_practice07;

import java.util.Scanner;

public class Q06_Encapsulation_BMI {
    /*
    BMI hesaplama kodunu yaziniz(guvenligi goz ardi etmeyiniz)

    BMI(Vucut kitle indeksi)
    BMI vucut kutlesinin vucut boyunun karesine bolunmesi olarak tanimlanir
    Baslica yetiskin BMI siniflandirmalari, zayif(18,5 kg/m2'nin altinda), normal agirlik(18.5 ile 25 arasinda)
    fazla kilolu( 25 ila 30) ve obez(30 veya daha fazla) seklindedir.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu kg cinsinden giriniz");
        double kilo = input.nextDouble();
        System.out.println("Boyunuzu metre cinsinden giriniz");
        double boy = input.nextDouble();

        BMI kisi1 = new BMI(kilo, boy);
        kisi1.BMIHesapla();
        System.out.println(kisi1);
    }
}
