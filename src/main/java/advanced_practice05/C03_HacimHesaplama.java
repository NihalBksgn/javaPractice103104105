package advanced_practice05;

public class C03_HacimHesaplama {
    //Kup, kare prizma dikdortgen prizmanin hacmini hesaplayan bir method olusturun(Method overloading kullanin)

    public static void main(String[] args) {


        Hacim hacim =new Hacim();
        int kupHacmi=hacim.hacimHesapla(5);
        System.out.println("Kupun hacmi:" + hacim.hacimHesapla(5));
        int kareprizma= hacim.hacimHesapla(5,6) ;
        System.out.println("Kare prizmanin hacmi: " + hacim.hacimHesapla(5,6));
        int dikdorgenprizma=  hacim.hacimHesapla(5,6,7);
        System.out.println("Dikdortgenin prizmanin hacmi: " + hacim.hacimHesapla(5,6,7) );
    }

}
