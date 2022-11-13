package advanced_practice07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C02_UzunKelime {
    /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle yaziniz");
        String cumle = input.nextLine();

        System.out.println(enUzunKelime(cumle));

    }//main


    public static List<String> enUzunKelime(String cumle){

        String [] arr= cumle.split(" ");
        int max=0;

        for (String w:arr ) {
            if(w.length()>max){
                max=w.length();
            }
        }

        List<String>enUzunKelimeler = new ArrayList<>();
        for (String w:arr) {
            if(w.length()==max){
                enUzunKelimeler.add(w);
            }
        }
        return enUzunKelimeler;
    }
}
