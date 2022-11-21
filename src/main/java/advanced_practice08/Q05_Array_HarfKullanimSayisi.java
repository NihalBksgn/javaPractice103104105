package advanced_practice08;

import java.util.HashMap;

public class Q05_Array_HarfKullanimSayisi {
    /*
    Girilen String'te hangi harfin kac kez kullanildigini gosteren kodu yaziniz
    input= String str = "Java is so Good";
    output= String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
     */
    public static void main(String[] args) {

        //1.yol:
        String str = "Java is so Good";
        String arr [] = str.split("");
        String cikti = "";

        for(String w: arr){
            int counter= 0;
            for(String u: arr){

                if(w.equalsIgnoreCase(u)){
                    counter++;
                }

            }if(!cikti.contains(w)){
                cikti+=w + counter + " ";
            }
        }
        System.out.println(cikti);

        //2.yol:HashMap kullanarak;

        String str1 = "Java is so Good";
        String arr1 [] = str.replaceAll(" ","").split("");

        HashMap<String,Integer> harfSayilari= new HashMap<>();
        for (String w:arr1) {
            Integer gorunumSayisi=harfSayilari.get(w);
            if(gorunumSayisi==null){
                harfSayilari.put(w,1);
            }else{
                harfSayilari.put(w,gorunumSayisi+1);
            }
        }
        System.out.println(harfSayilari);

    }
}
