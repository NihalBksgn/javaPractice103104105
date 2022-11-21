package advanced_practice07;

public class BMI {

    private double boy;
    private double kilo;

    public BMI(double boy, double kilo) {
        this.boy = boy;
        this.kilo = kilo;
    }

    public BMI() {
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }


    public  void BMIHesapla(){

        double bmi= kilo/(boy*boy);

        System.out.println("BMI: " + bmi);
        if(bmi>0 && bmi<18.5){
            System.out.println("zayif");
        }else if(bmi>=18.5 && bmi<25){
            System.out.println("Normal");
        }else if(bmi>=25 && bmi<30){
            System.out.println("kilolu");
        }else if(bmi>=30) {
            System.out.println("obez");
        } else{
                System.out.println("gecersiz deger");
            }
        }

    @Override
    public String toString() {
        return "BMI{" +
                "boy=" + boy +
                ", kilo=" + kilo +
                '}';
    }
}
