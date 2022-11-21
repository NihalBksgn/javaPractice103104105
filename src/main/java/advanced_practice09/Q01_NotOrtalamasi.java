package advanced_practice09;

import java.text.DecimalFormat;

public class Q01_NotOrtalamasi {
    // 4 ögrencinin not ortalamasini sirasiyla 6, 4, 3 ve 5 sinav olacak sekilde hesaplayan bir method yaziniz
    public static void main(String[] args) {
        ortalamaHesapla("Ali",95,96,95,100,80,60);
        ortalamaHesapla("Ayse",85,85,90,100);
        ortalamaHesapla("Veli",50,60,80);
        ortalamaHesapla("Esra",85,90,80,100,98);
    }

    public static void ortalamaHesapla(String isim, double... not){
        double sum=0;
        for(double w:not){
            sum+=w;
        }


        System.out.println(isim+ "'nin not ortalamasi: " + String.format("%.2f",sum/not.length));
    }
}
