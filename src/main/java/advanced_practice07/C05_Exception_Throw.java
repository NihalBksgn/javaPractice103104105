package advanced_practice07;

public class C05_Exception_Throw {


    /*
   randomSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den küçük ise hata verir") yazdırın.
     */
    public static void main(String[] args) {
        rondom();

    }

    private static void rondom() {
        int a = (int)(Math.random()*11);
        int b = (int)(Math.random()*11);

        System.out.println(a+ "--" + b);
        System.out.println(a+b);



    }
}
