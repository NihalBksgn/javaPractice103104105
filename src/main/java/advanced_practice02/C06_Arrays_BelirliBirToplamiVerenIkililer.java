package advanced_practice02;

public class C06_Arrays_BelirliBirToplamiVerenIkililer {
    public static void main(String[] args) {

        /*
        Toplamlari,verilen bir sayiya esit olan Array element ciftlerini yazdiran bir method olusturunuz

        {4,6,5,-10,8,5,20} ==> 10
        4 + 6 = 10
        5 + 5 = 10
        -10 + 20 = 10
         */
       int [] arr ={4,6,5,-10,8,5,20};
       ikilileriBul(arr,10);
    }

    public static void ikilileriBul(int []arr,int number){

        for(int i=0; i<arr.length;i++){
            for(int k=i+1; k<arr.length; k++){

                if(arr[i]+arr[k]==number){
                    System.out.println(arr[i] +"+" +arr[k] +"=" + number);
                }
            }
        }

    }
}
