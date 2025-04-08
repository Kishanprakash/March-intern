package Cast;

public class HerbsRunner {
    public static void main(String[] args) {

        Herbs herbs1 = new Herbs();
        herbs1.type();
        herbs1.aroma();
        herbs1.medicinalValue();
        herbs1.origin();
        herbs1.price();
        System.out.println("----------------------");

        Herbs herbs2 = new HerbsDetails();
        herbs2.type();
        herbs2.aroma();
        herbs2.medicinalValue();
        herbs2.origin();
        herbs2.price();
        System.out.println("----------------------");

        HerbsDetails herbs3 = new HerbsDetails();
        herbs3.type();
        herbs3.aroma();
        herbs3.medicinalValue();
        herbs3.origin();
        herbs3.price();
        herbs3.extraMethod();
        System.out.println("----------------------");

        HerbsCast caster = new HerbsCast();
        caster.cast(herbs2);
    }
}
