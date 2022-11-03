package advanced_practice04;

public class C06_Static_Butce_Runner {
    //Basit bir ev butcesi kodu yaziniz
    public static void main(String[] args) {

        Butce baba=new Butce();
        System.out.println(Butce.butce);
        baba.maasAl(5000);
        System.out.println(Butce.butce);
        System.out.println(baba.harclik);

        baba.harclikAl(500);
        baba.harclikHarca(266);
        baba.butcedenHarca(1000);
        baba.butcedenHarca(5000);

        System.out.println(baba.harclik);

        Butce anne= new Butce();
        anne.maasAl(2000);
        anne.maasAl(3000);
        anne.harclikAl(2000);
        anne.harclikHarca(300);

        System.out.println(Butce.butce);
        System.out.println(anne.harclik);
        System.out.println(Butce.butce);

        Butce kiz=new Butce();
        kiz.harclikAl(500);
        kiz.harclikHarca(400);

        System.out.println(Butce.butce);
        System.out.println(kiz.harclik);

    }
}
