package advanced_practice01;

import java.util.Scanner;

public class C04_IfStatement_DikUcgen {
    public static void main(String[] args) {

        /*
        Kullanicidan uc adet sayi alarak bu sayilarin bir dik ucgenin kenar uzunluklari
        olup olmadigini hesaplayan bir kod yaziniz
        (Yardim: Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        baglantisindan yararlanabilirsiniz)
         */


        Scanner input =new Scanner(System.in);
        System.out.println("Birinci kenari giriniz");
        int birinciKenar = input.nextInt();
        System.out.println("Ikinci kenari giriniz");
        int ikinciKenar = input.nextInt();
        System.out.println("Ucuncu kenari giriniz");
        int ucuncuKenar = input.nextInt();

        if(birinciKenar*birinciKenar+ikinciKenar*ikinciKenar == ucuncuKenar*ucuncuKenar){
            System.out.println("Bu bir dik ucgendir");
        } else if (ikinciKenar*ikinciKenar+ucuncuKenar*ucuncuKenar==birinciKenar*birinciKenar) {
            System.out.println("Bu bir dik ucgendir");
        } else if (birinciKenar*birinciKenar+ucuncuKenar*ucuncuKenar==ikinciKenar*ikinciKenar) {
            System.out.println("Bu bir dik ucgendir");
        }else {
            System.out.println("Bu bir dik ucgen degildir");
        }


    }
}
