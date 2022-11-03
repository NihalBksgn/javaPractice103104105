package advanced_practice04;

public class C03_Arrays_OrtalamadanBuyuk {
    //Elementlerin ortalamasindan buyuk elementleri yazdiran bir kod yaziniz
    public static void main(String[] args) {

        int [] arr ={5, 9, 15, 1, 0, 11, 3};

        int sum=0;

        for (int w: arr) {
            sum+=w;
        }
        double ort=sum/arr.length;
        System.out.println(ort);

        for (int w:arr) {
            if(w>ort){
                System.out.print(w+ " ");
            }
        }









    }
}
