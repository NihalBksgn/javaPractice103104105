package advanced_practice09.Q04_MaasHesaplama_Interface;

public class Runner {
    /*
    Net Maas hesaplayan kodu yaziniz(interface kullaniinz)
    Maas kriterleri:
                     Brut maasi belirle
                     Calisaninin toplam calisma yilina göre her yil icin maasi 100 dolar arttir
                     Calisanin aylik calisma saatine göre 160 saat ustu her saat icin maasi 10 dolar arttir
                     10 yil ve ustu calisma yili bulunan calisanlarin maaslarindan %30, digerlerinden %20 vergi kesintisi yap

     */
    public static void main(String[] args) {

        MaasHesapla ali = new MaasHesapla();
        double alininMaasi = ali.netMaas(10000,20,170);
        System.out.println("Ali'nin Maasi= " + alininMaasi);
    }
}
