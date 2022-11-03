package advanced_practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class C01_Variable {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Fahrenayt degeri giriniz");

        double f = input.nextDouble();
        double c = (f-32)*5/9;
        System.out.println(c);


        NumberFormat numberFormat = new DecimalFormat(".##");
        String formattedC = numberFormat.format(c);
        System.out.println(formattedC);


    }
}
