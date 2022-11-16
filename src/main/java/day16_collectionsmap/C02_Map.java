package day16_collectionsmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class C02_Map {
    //  Ad ve soyad bulunduruan iki ayrı array'i ad=soyad  seklinde yazdırınız.
// input : {"Ahmet", "Alev", "Gulay"};  {"Yilmaz", "Erdem", "Kaleli"};
// output : {Ahmet=Yilmaz, Alev =Erdem, Gulay=Kaleli};
    public static void main(String[] args) {

        String [] ad ={"Ahmet", "Alev", "Gulay"};
        String [] soyadd= {"Yilmaz", "Erdem", "Kaleli"};

        HashMap<String,String> tamisim= new HashMap<>();
        for (int i = 0; i < ad.length; i++) {
            tamisim.put(ad[i],soyadd[i]);

        }
        System.out.println(tamisim);
    }
  }