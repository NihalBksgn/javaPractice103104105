package day07_stringmanipulations;

import java.util.Scanner;

public class C05_StringManipulationsEmpty {
    public static void main(String[] args) {

        String str1 ="Hi";
        boolean bosMu =str1.isEmpty();//false
        System.out.println(bosMu);

        String str2 ="";
        System.out.println(str2.isEmpty());//true

        String str3 =" ";
        System.out.println(str3.isEmpty());//false


//Kullanicidan aldiginiz bir stringte bosluk karakterinin olup olmadigini kontrol ediniz
        Scanner input =new Scanner(System.in);

        System.out.println("Bir cumle yaziniz");
        String b= input.nextLine();
        boolean boslukVarMi= b.contains(" ");
        System.out.println(boslukVarMi);


    }
}
