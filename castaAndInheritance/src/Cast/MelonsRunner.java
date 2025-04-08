package Cast;

public class MelonsRunner {
    public static void main(String[] args) {

        Melons melons1 = new Melons();
        melons1.color();
        melons1.kg();
        melons1.size();
        melons1.origin();
        melons1.price();
        System.out.println("----------------------");

        Melons melons2 = new MelonsDetails();
        melons2.color();
        melons2.kg();
        melons2.size();
        melons2.origin();
        melons2.price();
        System.out.println("----------------------");

        MelonsDetails melons3 = new MelonsDetails();
        melons3.color();
        melons3.kg();
        melons3.size();
        melons3.origin();
        melons3.price();
        melons3.extraMethod();
        System.out.println("----------------------");

        MelonsCast caster = new MelonsCast();
        caster.cast(melons2);
    }
}
