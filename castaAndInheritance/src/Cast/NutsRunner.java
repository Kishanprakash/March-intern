package Cast;

public class NutsRunner {
    public static void main(String[] args) {

        Nuts nuts1 = new Nuts();
        nuts1.type();
        nuts1.crunchiness();
        nuts1.nutritionalValue();
        nuts1.origin();
        nuts1.price();
        System.out.println("----------------------");

        Nuts nuts2 = new NutsDetails();
        nuts2.type();
        nuts2.crunchiness();
        nuts2.nutritionalValue();
        nuts2.origin();
        nuts2.price();
        System.out.println("----------------------");

        NutsDetails nuts3 = new NutsDetails();
        nuts3.type();
        nuts3.crunchiness();
        nuts3.nutritionalValue();
        nuts3.origin();
        nuts3.price();
        nuts3.extraMethod();
        System.out.println("----------------------");

        NutsCast caster = new NutsCast();
        caster.cast(nuts2);
    }
}
