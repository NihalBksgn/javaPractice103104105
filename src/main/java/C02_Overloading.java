public class C02_Overloading {
    public static void main(String[] args) {

        //Ayni Class'ta ayni isimde method olusturmak icin method signatur degistirilir
        
        
        cikarma(98,(float)52.666);
        cikarma(14.5,3);
        toplama(55,66);
        toplama(2.3,4.5);
        carpma(2,3);
        carpma(8.9,32);


    }//main

    private static void carpma(double v, int i) {
        System.out.println("double ve int degerin carpimi: " + (v*i));
    }



    private static void toplama(double v, double v1) {
        System.out.println("iki double degerin toplami: " + (v+v1));
    }

    private static void toplama(int i, int i1) {

        System.out.println("iki int deger toplami:" + (i+i1));
    }

    private static void cikarma(double v, int i) {
        System.out.println("double ile int cikarma yontemi:" + (v-i));
    }

    private static void cikarma(int i, float v) {

        System.out.println("int bir deger ile float cikarma yontemi :" + (i-v));
    }

}
