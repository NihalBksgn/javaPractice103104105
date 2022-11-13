package advanced_practice07;

public class C01_ArrayToStringNegative {
    /*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
       */


    public static void main(String[] args) {

        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        String cumle="";
        for (String w:arr) {
            cumle+=w;
        }
        System.out.println(cumle);

//      System.out.println(cumle.substring(0,6) + "Not" + cumle.substring(6));

        System.out.println(cumle.replaceAll("Is","IsNot"));
    }
}
