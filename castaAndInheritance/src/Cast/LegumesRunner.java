package Cast;

public class LegumesRunner {
    public static void main(String[] args) {

        Legumes legumes1 = new Legumes();
        legumes1.color();
        legumes1.kg();
        legumes1.size();
        legumes1.origin();
        legumes1.price();
        System.out.println("----------------------");

        Legumes legumes2 = new LegumesDetails();
        legumes2.color();
        legumes2.kg();
        legumes2.size();
        legumes2.origin();
        legumes2.price();
        System.out.println("----------------------");

        LegumesDetails legumes3 = new LegumesDetails();
        legumes3.color();
        legumes3.kg();
        legumes3.size();
        legumes3.origin();
        legumes3.price();
        legumes3.extraMethod();
        System.out.println("----------------------");

        LegumesCast caster = new LegumesCast();
        caster.cast(legumes2);
    }
}
