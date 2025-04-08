package Cast;

public class BakeryRunner {
    public static void main(String[] args) {

        Bakery bakery1 = new Bakery();
        bakery1.type();
        bakery1.sweetness();
        bakery1.ingredients();
        bakery1.origin();
        bakery1.price();
        System.out.println("----------------------");

        Bakery bakery2 = new BakeryDetails();
        bakery2.type();
        bakery2.sweetness();
        bakery2.ingredients();
        bakery2.origin();
        bakery2.price();
        System.out.println("----------------------");

        BakeryDetails bakery3 = new BakeryDetails();
        bakery3.type();
        bakery3.sweetness();
        bakery3.ingredients();
        bakery3.origin();
        bakery3.price();
        bakery3.extraMethod();
        System.out.println("----------------------");

        BakeryCast caster = new BakeryCast();
        caster.cast(bakery2);
    }
}
