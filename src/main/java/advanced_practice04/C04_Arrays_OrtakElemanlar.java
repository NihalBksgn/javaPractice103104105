package advanced_practice04;

import java.util.ArrayList;
import java.util.List;

public class C04_Arrays_OrtakElemanlar {
    /*
        Iki Array'de ortak bulunan elementleri yazdiriniz
        (case sensitivity olmadan)

        input1 : {John,Brad,Angel,Sofia,Emily}
        input2 : {sofia,brad,grace,emily,hazel}

        output :{brad,sofia,emily}
     */
    public static void main(String[] args) {

        String [] arr1 ={"John","Brad","Angel","Sofia","Emily"};
        String [] arr2 ={"sofia","brad","grace","emily","hazel"};

        List<String> list = new ArrayList<>();
        for (String w: arr1) {
            for (String k: arr2) {
                if(w.equalsIgnoreCase(k)){
                    list.add(w);
                }

            }
        }
        System.out.println(list);




    }
}
