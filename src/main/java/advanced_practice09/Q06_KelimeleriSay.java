package advanced_practice09;

import java.util.HashMap;

public class Q06_KelimeleriSay {
    /*
    Bir String icerisindeki kelimelerin kac kez tekrr ettigini bulan bir kod yaziniz

    input: "Ali okula geldi ve Ayse de okula geldi."
    output: Ali=1, okula=2 geldi=2, ve =1, Ayse=1, de=1
     */

    public static void main(String[] args) {
        String str="Ali   okula   geldi ve      Ayse de okula geldi.";
        str= str.replaceAll("\\p{Punct}","").replaceAll("\\s+"," ").trim();
        System.out.println(str);
        String [] arr = str.split(" ");
        HashMap<String,Integer> kelimeSayilari=new HashMap<>();

        for(String w: arr){

            if(!kelimeSayilari.containsKey(w)){
                kelimeSayilari.put(w,1);
            }else{
                kelimeSayilari.put(w,kelimeSayilari.get(w) +1);
            }
        }
        System.out.println(kelimeSayilari);
    }
}
