package day11_multidimensionalarrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_Fibonacci {
    public static void main(String[] args) {

        /*
         INTERWIEW
        Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
        0-1-1-2-3-5-8-13-21-34....
        */


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();
        int fibonacci = 0;
        int fiboA = 1;
        int fiboB = 1;
        System.out.print(fiboA + " ");
        System.out.print(fiboB + " ");
        for (int i = 1; i < sayi - 1; i++) {

            fibonacci = fiboA + fiboB;
            fiboA = fiboB;
            fiboB = fibonacci;
            System.out.print(fibonacci + " ");

        }

        //2.yol

        List<Integer> fibonacchi=new ArrayList<>();
        fibonacchi.add(0);
        fibonacchi.add(1);
        int i=1;
        if(sayi<=1){
            System.out.println("Lutfen 1'den buyuk bir sayi giriniz");
        }else{
            while(fibonacchi.get(i)<sayi){
                fibonacchi.add(fibonacchi.get(i)+fibonacchi.get(i-1));
                i++;
            }
            if(fibonacchi.get(fibonacchi.size()-1)>sayi){//fibonacchi de yer almiyorsa
                fibonacchi.remove(fibonacchi.size()-1);//son elemani sil
                System.out.println("Girdiginiz sayi fibonacchi de yer almiyor.Girilen sayiya kaadrki fibonachhi" + fibonacchi);
            }else{
                System.out.println("Girdiginiz sayi bir fibonachhi sayisidir"+ fibonacchi);
            }
        }


    }
}
