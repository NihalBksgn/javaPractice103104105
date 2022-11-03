package day03_ifStatement;

public class C04_MantikOperatorleri {
    public static void main(String[] args) {

        //&& ile

        System.out.println(5+2==8);//false

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc:" + sonuc1);

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc: " + sonuc2);

        int sayi1=15;
        //sayi1'in 10 ile 20araliginda oldugunu true diyerek dondurelim
        //10<sayi1<20  java uclu karsilastirma yapmaz
        //ikili karsilastirmalar yapip mantiksal operatorler ile birlestirmeliyiz

        System.out.println(10<sayi1 && sayi1<20);// true

        int sayi2=5;
        //sayi2'nin 10 ile 20 araliginda olmadigini true diyerek donduren bir kod yaziniz.

        System.out.println(sayi2<10 || sayi2<20);








    }
}
