package day12_localdatetimeVarargsOverloadingOverriding;

public class C03_Varargs {
    public static void main(String[] args) {
        //Verilen String ifadeleri birlestiren concat isimli bir method olusturun

        concat("Safran","bolu","evleri");

    }

    private static void concat(String ... a) {
        String sonuc="";
        for (String w:a) {
            sonuc+=w;

        }
        System.out.println(sonuc);
    }


}
