package advanced_practice04;

public class C07_Variable_ArttirmaAzaltma {

    public static void main(String[] args) {

        int x=20;
        int y=15;

        System.out.println(x++ + ++y);//36
        System.out.println(x);//21

        int z = 5;

        int sonuc = ++z  +  z++  +   z++   +   --z   +   z--   +   z;//39
                    //6      6        7         7        7         6
        System.out.println(sonuc);



    }
}
