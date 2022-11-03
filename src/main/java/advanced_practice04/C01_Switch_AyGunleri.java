package advanced_practice04;

import java.util.Scanner;

public class C01_Switch_AyGunleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Yili giriniz");
        int yil = input.nextInt();
        System.out.println("Ay numarasini giriniz");
        int ay = input.nextInt();

        int gun;
        switch (ay) {
            case 1: case 3:
            case 5: case 7:
            case 8: case 10:
            case 12:
                gun = 31;
                System.out.println("Girdiginiz ayin gun sayisi:" + gun);
                break;
            case 4: case 6:
            case 9: case 11:
                gun = 30;
                System.out.println("girdiginiz ayin gun sayisi:" + gun);
                break;

            case 2:
                if((yil%4==0  &&  yil%100!=0) || yil%400==0  ){
                    gun=29;
                    System.out.println("girdiginiz ayin gun sayisi:" + gun);
                }else{
                    gun=28;
                    System.out.println("girdiginiz ayin gun sayisi:" + gun);
                }break;
            default:
                System.out.println("gecerli bir ay numarasi giriniz");
        }


    }
}
