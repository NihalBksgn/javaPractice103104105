package advanced_practice09.Q03_AbstractionAlanHesaplama;

public class Runner {
    //Dikdörtgen ve ucgenin alanlarini hesaplayan bir kod yaziniz(abstraction kullanin)
    public static void main(String[] args) {

        Ucgen ucgen =new Ucgen();
        System.out.println(ucgen.alanHesapla(4,2));

        System.out.println(new Dikdörtgen().alanHesapla(5,4));
    }

}
