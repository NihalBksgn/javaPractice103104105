package day16_collectionsmap;

public class EnumRunner {
    public static void main(String[] args) {

        Level oyun = Level.MEDIUM;

        switch (oyun){
            case LOW:
                System.out.println("Kolay bir oyun");
                break;
            case MEDIUM:
                System.out.println("Orta seviyede bir oyun");
                break;
            case HEIGH:
                System.out.println("Zor bir oyun");
                break;
        }
    }
}
