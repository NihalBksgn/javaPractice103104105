package advanced_practice08;

import java.util.ArrayList;
import java.util.List;

public class Q06_List_RastgeleSayi {
    /*
    Bir List icerisine 0'dan 20'ye rastgele 10 tamsayi atayan ve atanan cift sayilari "ciftSayi" String degerine donüstüren
    bir kod yaziniz.Eger cift sayi icermezse "Cift Sayi Yoktur" yazdirin.

    örn:[19, 11, 10, 19, 4, 6, 15, 18, 1, 14]
        [19, 11, CiftSayi, 19, ciftsayi,ciftsayi,15, ciftsayi,1,ciftsayi]
     */
    public static void main(String[] args) {
        rastgeleSayiEkle();
    }

    public static void rastgeleSayiEkle() {

        List<Object> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 21));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if ((int)(list.get(i)) % 2 == 0) {
                list.set(i, "CiftSayi");
            }
        }
        System.out.println(list);

    }
}
