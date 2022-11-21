package advanced_practice09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_MAp_UrunFiyatlariniToplaEntrySet {
    /*
    Bir Map icerisinde verilen fiyatlarin toplamini bulan bir kod yaziniz(for each loop kullaniniz)
    örn: {Kemer=19.99, Gomlek=29.99, Ayakkabi=89.99, Kazak=24.99, Kravat=19.99}==> Toplam=184.95
     */



    public static void main(String[] args) {
        HashMap<String,Double> urunler = new HashMap<>(Map.of("Kemer",19.99,"Gomlek",29.99,"Ayakkabi",
                89.99,"Kazak",24.99,"Kravat",19.99));

        System.out.println(urunler);
        System.out.println(fiyatToplami(urunler));
    }


    public static double fiyatToplami(Map<String,Double> map){

        double sum = 0;

        for(Map.Entry<String, Double> w: map.entrySet()){
           sum += w.getValue();
        }
        return sum;
    }

}
