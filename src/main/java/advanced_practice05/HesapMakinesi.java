package advanced_practice05;

public class HesapMakinesi {

    public static void toplama(int ...a){
        int toplam=0;
        for (int w:a) {
            toplam+=w;
        }
        System.out.println("Toplam: " + toplam);
    }
    public static void cikarma(int a, int b){
        System.out.println("Fark: " + (a-b));
    }

    public static void carpma (int ...a){
        int carpim =1;
        for (int w:a) {
            carpim*=w;
        }
        System.out.println("carpim:" + carpim);
    }

    public static void bolme(double a, double b){
        if (b==0){
            System.out.println("Bolen sayi 0 olamaz");
        }else
        System.out.println("Bolum:" + (a/b));
    }
}
