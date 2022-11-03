package day04_ifStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");

        //1.yol:
//        String gun = input.next().toLowerCase();
//        if(gun.equals("cuma")){
//            System.out.println("Müslümanlar icin kutsal gun");
//        }
//        if(gun.equals("cumartesi")){
//            System.out.println("Yahudiler icin kutsal gun");
//        }
//        if(gun.equals("pazar")){
//            System.out.println("Hristiyanlar icin kutsal gun");
//        }if(!gun.equals("cuma")  && !gun.equals("cumartesi") && !gun.equals("pazar")){
//            System.out.println("kutsal gun degil");
//        }

        //2.yol;
//        String gun = input.next();
//        if(gun.equalsIgnoreCase("cuma")){
//            System.out.println("Müslümanlar icin kutsal gun");
//        }if(gun.equalsIgnoreCase("cumartesi")){
//            System.out.println("yahudiler icin kutsal gun");
//        }if(gun.equalsIgnoreCase("pazar")){
//            System.out.println("hristiyanlar icin kutsal gun");
//        }if(!gun.equalsIgnoreCase("cuma") &&
//                !gun.equalsIgnoreCase("cumartesi") &&
//                !gun.equalsIgnoreCase("pazar")){
//            System.out.println("kutsal gun degildir");
//        }

        //3.yol:
        String gun = input.next().toLowerCase();
        if(gun.equals("cuma")){
            System.out.println("Müslümanlar icin kutsal gun");
        }else if(gun.equals("cumartesi")){
            System.out.println("yahudiler icin kutsal gun");
        }else if(gun.equals("pazar")){
            System.out.println("hristiyanlar icin kutsal gun");
        }else{
            System.out.println("kutsal gun degildir");
        }












    }
}
