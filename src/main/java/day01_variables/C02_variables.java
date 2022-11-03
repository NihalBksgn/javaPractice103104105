package day01_variables;

public class C02_variables {

    public static void main(String[] args) {

        // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        int x= 123;
        System.out.println("x = " + x);


        double a = 15.2;
        System.out.println("a = " + a);

        char b = 'A';
        System.out.println("b = " + b);

        String okulIsmi = "Techpro";
        System.out.println("okulIsmi = " + okulIsmi);


        //2- isim ve soyisim icin iki variable olusturun ve bunlari
        //  isminiz : Ahmet Can
        //  soyisminiz : Ates
        //  seklinde yazdirin

       String isminiz ="Ahmet Can";
       String soyIsim ="Ates";

        System.out.println("isminiz = " + isminiz);
        System.out.println("soyIsim = " + soyIsim);

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        int z= 5;
        int y= 6;

        int sonuc= z+y;
        System.out.println("sonuc = " + sonuc);


        //4- Bir tamsayi ve bir ondalikli variable olusturun
        //bunlarin toplamini yazdirin

        int deger1= 15;
        double deger2= 5.2;
        double toplam = deger1+deger2;

        System.out.println("toplam = " + toplam);

        //5 – char data turunde bir variable olusturun ve yazdirin

        char krktr='k';
        System.out.println(krktr);




        //6- bir tamsayi ile bir harfi toplayiniz.
         int deger5= 20;
         char harf= 'm';

        //1.yol

        int toplam1= deger5+harf;
        System.out.println("toplam1 = " + toplam1);

        //2.yol

        System.out.println("toplam2 = " + (deger5+harf));





    }
}
