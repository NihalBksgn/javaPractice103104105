package advanced_practice06;

public class C04_Kutuphane {
    //Kutuphaneye eklemek istediginiz kitaplari adi, yazar adi, sayfa sayisi,seri numarasi
    //ile yazdiran bir kod yaziniz
    public static void main(String[] args) {

        Kitap kitap1 = new Kitap("Harry Potter","j k rowling",500);
        kitap1.kitapBilgileri();
        Kitap kitap2 = new Kitap("1984","George Orwell",352);
        kitap2.kitapBilgileri();


    }
}
