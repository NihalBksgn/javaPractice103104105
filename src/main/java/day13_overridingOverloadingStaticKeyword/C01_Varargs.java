package day13_overridingOverloadingStaticKeyword;

public class C01_Varargs {
    public static void main(String[] args) {

        //verilen sayyirldan ilki haric tum sayilari toplayip, ilk sayiyla carpan bir method olusturunuz

        int sayi1=5;
        int sayi2=7;
        int sayi3=2;
        int sayi4=4;
        int sayi5=9;

        toplam(5,7,2,4,4,9);





    }

    private static void toplam(int i, int...toplanacakSayi) {
       int sum=0;
        for (int w:toplanacakSayi) {
            sum+=w;
        }
        System.out.println(sum);

        int sonuc= i* sum;
        System.out.println(sonuc);
    }
}
