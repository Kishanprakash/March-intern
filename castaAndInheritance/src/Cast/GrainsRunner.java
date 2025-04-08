package Cast;

public class GrainsRunner {
    public static void main(String[] args) {

        Grains grains1 = new Grains();
        grains1.type();
        grains1.weight();
        grains1.nutritionalValue();
        grains1.origin();
        grains1.price();
        System.out.println("----------------------");

        Grains grains2 = new GrainsDetails();
        grains2.type();
        grains2.weight();
        grains2.nutritionalValue();
        grains2.origin();
        grains2.price();
        System.out.println("----------------------");

        GrainsDetails grains3 = new GrainsDetails();
        grains3.type();
        grains3.weight();
        grains3.nutritionalValue();
        grains3.origin();
        grains3.price();
        grains3.extraMethod();
        System.out.println("----------------------");

        GrainsCast caster = new GrainsCast();
        caster.cast(grains2);
    }
}
