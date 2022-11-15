package day15_exceptionsabstraction;

public class C01_TryCatch {
    //verilen iki sayiyi 10 kez bolen kodu yaziniz

    public static void main(String[] args) {
        int sayi1= 100;
        int sayi2= 5;



      int sayac=1;
       /*
      while (sayac<10){
          System.out.println(sayi1/sayi2);
          sayi2--;
          sayac++;
      }*/

//        System.out.println("**************IF ELSE*************");
//
//        while (sayac<10){
//            if(sayi2==0){
//                System.out.println("islem yapilirken payda 0 oldu");
//            }else{
//                System.out.println(sayi1/sayi2);
//
//            }
//            sayi2--;
//            sayac++;
//        }

        //try-catch ile
        int a=100;
        int b=5;
        int sayac2=1;

        while (sayac2<10){

            try {
                System.out.println(a/b);
            }catch (Exception e){

                System.out.println("payda sifir oldu");
            }
            b--;
            sayac2++;

        }
    }
}
