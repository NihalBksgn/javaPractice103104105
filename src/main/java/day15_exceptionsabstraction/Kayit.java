package day15_exceptionsabstraction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit extends Runner {

    static List<String> listKullaniciId=new ArrayList<>();
    static  List<Integer>listKullaniciSaniye=new ArrayList<>();
    static Scanner input= new Scanner(System.in);
    static int counter=0;

    public void kayit(){
        String kullaniciId="";
        System.out.println("Lutfen kullanici Id giriniz");
        kullaniciId=input.nextLine();

        int kullaniciSaniye= LocalDateTime.now().getSecond();
        System.out.println(kullaniciSaniye);

        listKullaniciId.add(kullaniciId);
        listKullaniciSaniye.add(kullaniciSaniye);

        tamamMiDevamMi();
    }

    private void tamamMiDevamMi() {

        String tmmMDvmmM ="";

        do{

            System.out.println("Baska kayit var mi? (E/H) ");
            tmmMDvmmM=input.next();

            if(tmmMDvmmM.equalsIgnoreCase("e")){
                kayit();
            }else if(tmmMDvmmM.equalsIgnoreCase("h")){
                System.out.println("gule gule");
                break;
            }
        }while (!tmmMDvmmM.equalsIgnoreCase("e")&& !tmmMDvmmM.equalsIgnoreCase("h"));

            counter++;

            if(counter==1){
                SansliKullanici snslKlnc = new SansliKullanici();
                snslKlnc.sansliKullaniciYazdir(listKullaniciId,listKullaniciSaniye);
            }
    }

}
