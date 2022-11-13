package advanced_practice05;

public class C05_Market_Constructor {
    //Urun adi, fiyati ve (varsa) son kullanma tarihlerini yazdiran bir market programi yaziniz
    public static void main(String[] args) {

        Market ekmekObjesi = new Market("Ekmek",5,1);

        System.out.println("Urunun Adi: "+ ekmekObjesi.urunAdi + " Urun Fiyati:" + ekmekObjesi.urunFiyati +" Son Kullanma Tarihi: " + ekmekObjesi.sonKullanmaTarihi);

        Market nutellaObjesi = new Market("Nutella",45,20);
        System.out.println("Urunun Adi: " +nutellaObjesi.urunAdi + " Urun Fiyati: "+nutellaObjesi.urunFiyati+ " Son Kullanma Tarihi: " +nutellaObjesi.sonKullanmaTarihi);

        Market bardakObejesi = new Market("Bardak",50);
        System.out.println("Urunun Adi: " +bardakObejesi.urunAdi + " Urun Fiyati: "+bardakObejesi.urunFiyati+ " Son Kullanma Tarihi: " +bardakObejesi.sonKullanmaTarihi);
    }
}
