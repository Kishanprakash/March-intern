package Cast;

public class SpicesRunner {
    public static void main(String[] args) {

        Spices spices1 = new Spices();
        spices1.type();
        spices1.aroma();
        spices1.heatLevel();
        spices1.origin();
        spices1.price();
        System.out.println("----------------------");

        Spices spices2 = new SpicesDetails();
        spices2.type();
        spices2.aroma();
        spices2.heatLevel();
        spices2.origin();
        spices2.price();
        System.out.println("----------------------");

        SpicesDetails spices3 = new SpicesDetails();
        spices3.type();
        spices3.aroma();
        spices3.heatLevel();
        spices3.origin();
        spices3.price();
        spices3.extraMethod();
        System.out.println("----------------------");

        SpicesCast caster = new SpicesCast();
        caster.cast(spices2);
    }
}
