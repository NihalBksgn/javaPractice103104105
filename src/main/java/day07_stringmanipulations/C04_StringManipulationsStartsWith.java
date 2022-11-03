package day07_stringmanipulations;

public class C04_StringManipulationsStartsWith {
    public static void main(String[] args) {


/**
 * startsWith()
 *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 *
 * endsWith()
 * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 */

        String cumle = "Kazananlar hic hata yapmayanlar degil,vazgecmeyenlerdir";
        //Ka ile basliyormu?
        boolean kaMi = cumle.startsWith("Ka");
        System.out.println(kaMi);

        //dir ile bitiyormu?
        boolean dir = cumle.endsWith("dir");
        System.out.println(dir);
String s = "Learn";
String t = "Java";
        System.out.println(s.length()>s.charAt(2));

    }
}
