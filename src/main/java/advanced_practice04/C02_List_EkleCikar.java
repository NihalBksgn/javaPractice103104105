package advanced_practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_List_EkleCikar {
    /*
       Kullanicidan aldiginiz bir sayiyi bir List'e ekleyen,
       List'den cikaran ya da mevcut bir elementi o sayi ile guncelleyen bir kod yaziniz
        */
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true){
            System.out.println("Ekleme yapmak icin 'add'\n " +
                    "Guncelleme yapmak icin 'update'\n" +
                    "Silmek icin 'delete'\n" +
                    "CIkmak icin 'quit' komutunu giriniz.");

           String option = input.next();

           if(option.equalsIgnoreCase("add")){
               System.out.println("eklemek istediginiz sayiyi giriniz");
               int eklenecekSayi= input.nextInt();
               list.add(eklenecekSayi);
           }else if(option.equalsIgnoreCase("update")){
               System.out.println("guncellemek istediginiz sayiyi giriniz");
               int guncellenecekSayi= input.nextInt();
               System.out.println("girmek istediginiz yeni sayiyi giriniz");
               int yeniSayi= input.nextInt();
               list.set(list.indexOf(guncellenecekSayi), yeniSayi);

           }else if(option.equalsIgnoreCase("delete")){
               System.out.println("silmek istediginiz sayiyi giriniz");
               int silinecekSayi= input.nextInt();
              // list.remove((Integer)silinecekSayi);
               list.remove(list.indexOf(silinecekSayi));
           } else if (option.equalsIgnoreCase("quit")) {
               break;
           }else{
               System.out.println("Gecerli bir komut giriniz");
           }
            System.out.println(list);
        }
        System.out.println("Gule gule");

    }
}
