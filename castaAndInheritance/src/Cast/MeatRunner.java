package Cast;

public class MeatRunner {
    public static void main(String[] args) {

        Meat meat1 = new Meat();
        meat1.type();
        meat1.weight();
        meat1.freshness();
        meat1.origin();
        meat1.price();
        System.out.println("----------------------");

        Meat meat2 = new MeatDetails();
        meat2.type();
        meat2.weight();
        meat2.freshness();
        meat2.origin();
        meat2.price();
        System.out.println("----------------------");

        MeatDetails meat3 = new MeatDetails();
        meat3.type();
        meat3.weight();
        meat3.freshness();
        meat3.origin();
        meat3.price();
        meat3.extraMethod();
        System.out.println("----------------------");

        MeatCast caster = new MeatCast();
        caster.cast(meat2);
    }
}
