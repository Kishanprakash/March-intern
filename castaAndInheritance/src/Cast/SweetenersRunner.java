package Cast;

public class SweetenersRunner {
    public static void main(String[] args) {

        Sweeteners sweeteners1 = new Sweeteners();
        sweeteners1.color();
        sweeteners1.kg();
        sweeteners1.size();
        sweeteners1.origin();
        sweeteners1.price();
        System.out.println("----------------------");

        Sweeteners sweeteners2 = new SweetenersDetails();
        sweeteners2.color();
        sweeteners2.kg();
        sweeteners2.size();
        sweeteners2.origin();
        sweeteners2.price();
        System.out.println("----------------------");

        SweetenersDetails sweeteners3 = new SweetenersDetails();
        sweeteners3.color();
        sweeteners3.kg();
        sweeteners3.size();
        sweeteners3.origin();
        sweeteners3.price();
        sweeteners3.extraMethod();
        System.out.println("----------------------");

        SweetenersCast caster = new SweetenersCast();
        caster.cast(sweeteners2);
    }
}
