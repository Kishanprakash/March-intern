package Cast;

public class BerriesRunner {
    public static void main(String[] args) {

        Berries berries1 = new Berries();
        berries1.color();
        berries1.kg();
        berries1.size();
        berries1.origin();
        berries1.price();
        System.out.println("----------------------");

        Berries berries2 = new BerriesDetails();
        berries2.color();
        berries2.kg();
        berries2.size();
        berries2.origin();
        berries2.price();
        System.out.println("----------------------");

        BerriesDetails berries3 = new BerriesDetails();
        berries3.color();
        berries3.kg();
        berries3.size();
        berries3.origin();
        berries3.price();
        berries3.extraMethod();
        System.out.println("----------------------");

        BerriesCast caster = new BerriesCast();
        caster.cast(berries2);
    }
}
