package day08_loops;

import java.util.Scanner;

public class C01ForLoop {
    public static void main(String[] args) {

        //Kullanicidan baslangic , bitis ve artis miktarini alarak
        // aradaki tum sayilari aralarina virgul koyarak yazdirin
        Scanner input=new Scanner(System.in);

        int baslangic=10;
        int bitis = 50;
        int artisMiktari=5;

        for(int i=baslangic; i<bitis; i=i+artisMiktari){
            System.out.print(i + ",");
        }
        System.out.println(bitis);
















    }
}
