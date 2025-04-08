package Cast;

public class CondimentsRunner {
    public static void main(String[] args) {

        Condiments condiments1 = new Condiments();
        condiments1.color();
        condiments1.kg();
        condiments1.size();
        condiments1.origin();
        condiments1.price();
        System.out.println("----------------------");

        Condiments condiments2 = new CondimentsDetails();
        condiments2.color();
        condiments2.kg();
        condiments2.size();
        condiments2.origin();
        condiments2.price();
        System.out.println("----------------------");

        CondimentsDetails condiments3 = new CondimentsDetails();
        condiments3.color();
        condiments3.kg();
        condiments3.size();
        condiments3.origin();
        condiments3.price();
        condiments3.extraMethod();
        System.out.println("----------------------");

        CondimentsCast caster = new CondimentsCast();
        caster.cast(condiments2);
    }
}
