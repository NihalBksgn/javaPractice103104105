package advanced_practice04;

public class C05_StringBuilderPalindrome {
    //Bir String degerin palindrom olup olmadigini konrol eden bir kod yaziniz

    public static void main(String[] args) {
        String str = "Nazan1";
//        String strReverse= "";
//
//        for (int i =str.length()-1; i >-1 ; i--) {
//            strReverse += str.charAt(i);
//        }
//        System.out.println(strReverse);
//
//        if(str.equalsIgnoreCase(strReverse)){
//            System.out.println("polindrom");
//        }else{
//            System.out.println("polindrom degildir");
//        }



        //2.yol
        StringBuilder strb =new StringBuilder(str);
        strb.reverse();
        String stReverse=strb.toString();
        if(str.equalsIgnoreCase(stReverse)){
            System.out.println("polindrom");
        }else{
            System.out.println("polindrom degildir");
        }
    }
}
