package day04_ifStatement;

import java.util.Scanner;

public class C04_IfFtatement {

    public static void main(String[] args) {

        /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
         Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
         test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi girin");
        String jobTitel= input.next().toLowerCase();
        if(jobTitel.equals("qa")){
            System.out.println("Quality Analyst");
        }else if(jobTitel.equals("ba")){
            System.out.println("Business Analyst");
        }else if(jobTitel.equals("pm")){
            System.out.println("Project Manager");
        }else System.out.println("gecerli bir is unvani giriniz");
    }
}
