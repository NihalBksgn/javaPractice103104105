package advanced_practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02_MarketGunlukGelir {
    /*
    Gunluk gelir market programi yaziniz
    -Tum gunlerin gelirlerini gösteren bir method ,
    -Haftalik gelir ortalamasini gosteren bir method,
    -Hangi gunlerin ortalama gelirden fazla geliri oldugunu gosteren bir method,
    -Hangi gunlerin ortalama gelirden az geliri oldugunu gosteren bir method,
     */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukGelirler = new ArrayList<>();
    static double toplamGelir;
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        tumGunlerinGelileri();
        System.out.println("ortalama gelir: " + gelirOrtalamasiniAl());
        System.out.println("ortalamanin ustundeki gunler: " + ortalamaninUstundekiGunler());
        System.out.println("ortalamanin altindaki gunler: "+ ortalamaninAltindakiGunler());
    }


    //tum gunlerin gelirlerini gosteren method:
    public static void tumGunlerinGelileri() {
        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + " gununun gelirini giriniz");
            double gununGeliri = input.nextDouble();
            gunlukGelirler.add(gununGeliri);
            toplamGelir += gununGeliri;
            gun++;
        }
        System.out.println(gunlukGelirler);
    }

    //Haftalik gelir ortalamasini gosteren method;

    public static double gelirOrtalamasiniAl(){

        double gelirOrtalamasi= toplamGelir/gunler.size();
        return gelirOrtalamasi;
    }
    //Ortalamanin ustundeki gunleri gosteren method:

    public static String ortalamaninUstundekiGunler(){
        String ortUstGunler="";
        for(int i=0; i<gunlukGelirler.size(); i++){
            if(gunlukGelirler.get(i)>gelirOrtalamasiniAl()){
                ortUstGunler+=gunler.get(i) + " ";
            }
        }return ortUstGunler;
    }

    //Ortalamanin altindaki gunleri gosteren method:
    public static String ortalamaninAltindakiGunler(){
        String ortAltGunler="";
        for(int i=0; i<gunlukGelirler.size(); i++){
            if(gunlukGelirler.get(i)<gelirOrtalamasiniAl()){
                ortAltGunler+=gunler.get(i) + " ";
            }
        }return ortAltGunler;
    }






}
