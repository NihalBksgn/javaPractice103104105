package advanced_practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C06_MountainArray {
    public static void main(String[] args) {

        /*
     Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
     Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
        */

        int[] arr = {-999, 1, 2, 5, 7, 9, 22, 8, 3, 1, };

        List<Integer> list = new ArrayList<>();
        for (int w : arr) {
            list.add(w);
        }
        System.out.println("list" + list);

        int max = arr[0];
        for (int w : arr) {
            if (w > max) {
                w = max;
            }
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                break;
            }
            list1.add(arr[i]);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i<list.indexOf(max)) {
                continue;
            }
            list2.add(arr[i]);
        }

        List<Integer> list1copy = new ArrayList<>();
        list1copy.addAll(list1);
        Collections.sort(list1copy);

        List<Integer> list2copy = new ArrayList<>();
        list2copy.addAll(list2);
        Collections.sort(list2copy);
        Collections.reverse(list2copy);

        if (list1.equals(list1copy) && list2.equals(list2copy)) {
            System.out.println("Arrayiniz Mountaindir");
        }else {
            System.out.println("Arrayiniz Mountain DEGILDIR");
        }
    }
}