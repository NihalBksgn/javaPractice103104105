package advanced_practice01;

public class C03_RegexQuantifiers {
    public static void main(String[] args) {
        //Bir string degerin belirli bir sayida karakter icerip belirli bir karakterle bitip bitmedigini kontrol eden bir kod yaziniz

        String str ="as";
        System.out.println(str.matches(".."));//true
        System.out.println(str.matches(".s"));//true herhangi bir karakterle baslayip s ile bitiyor mu


        //Bir String degerin ikinci karakterinin belirli bir karakter olup olmadigini kntorl eden kodu yaziniz
        String str2 = "nsljljöjö";

        System.out.println(str2.matches(".s.*"));// 2. karakter s iceriyormu ? .* istedigin kadar karakter olabilir demek

        //Bir String degerin sadece harf icerip icermedigini kontrol ediniz
        System.out.println("abc".matches("[a-zA-Z]*"));

        //Bir String degerin belirli bir sayida belirli karakterleri icerdigini kontrol eden kodu yaziniz
        System.out.println("abcdhg".matches("[a-zA-Z]{5}"));//false 5den fazla karakter icerir

        //Bir String degerin belirli karakterleri en az belirli sayida icerip icermedigini kontrol eden kodu yaziniz
        System.out.println("123456789".matches("[0-9]{6,}"));//true en az 6 rakam iceriyor

        //Bir String degerin belirli karakterleri en az ve en fazlacok belirli  sayida icerip icermedigini kontrol eden kodu yaziniz
        System.out.println("123456789456".matches("[0-9]{6,10}"));//false  en az 6 en cok 10rakam icermeli

        //ilk karakter 1, ikinci karakter noktalama isareti ve kalan 8 karakter rakam toplam 10 karakter olmali
        System.out.println("1?12345678".matches("[1][\\p{Punct}][0-9]{8}"));//true
    }

}
