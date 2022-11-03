package day10_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays_interwiew {
    public static void main(String[] args) {

        /*
            INTERWIEW QUESTIONS
             Kullanicidan bir String aliniz.
             String'de var olan her character'in sayisini ekrana yazdiriniz.
            Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
                abaa   ==> a=3  b=1
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir String ifade giriniz");
        String str = input.nextLine();

        String arr []= str.split("");

        int sayac = 0;
        Arrays.sort(arr);

        for (int i=1; i<arr.length;i++){

                if(arr[i-1].equals(arr[i])){
                    sayac++;//ayni karakterse sayaci bir arttir

            }else{
                    System.out.println(arr[i-1] + " karakter sayisi:" + (sayac+1));//sayac sifir old icin
                    sayac=0;//farkli karaktere gectigi icin sayaci sifirla
                }
                if(i==arr.length-1){
                    System.out.println(arr[i] +" karakterinin sayisi:" + (sayac+1));
                }

        }







    }
}
