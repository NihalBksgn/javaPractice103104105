package day11_multidimensionalarrays;


import java.util.Arrays;
import java.util.Scanner;

public class C01_MultidimensionalArrays {
    public static void main(String[] args) {

//Stringte gecen sesli harfleri saydiriniz
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir String ifade giriniz");
        String str=input.nextLine().toLowerCase();

String [] arr= str.split("");
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equalsIgnoreCase("a")||
                    arr[i].equalsIgnoreCase("e")||
                    arr[i].equalsIgnoreCase("u")||
                    arr[i].equalsIgnoreCase("o")||
                    arr[i].equalsIgnoreCase("i"))
            {
                System.out.println(arr[i]);
            }

        }

    }
}