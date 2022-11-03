package day08_loops;

public class C06_NestedLoop {
    public static void main(String[] args) {

        /*

         *
        * *
       *   *
      *     *
     *********

         */

        int satir = 5;
        int sutun = 9;
        for (int i=1; i<6; i++) {

            for(int k =1; k<10; k++){


                if((i==1 && k==5) || (i==2 && (k==4 || k==6)) || (i==3 && (k==3 || k==7)) || (i==4 && (k==2 || k==8)) ||
                        i==5){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
