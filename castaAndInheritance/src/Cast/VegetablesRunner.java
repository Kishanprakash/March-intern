package Cast;

public class VegetablesRunner {
    public static void main(String[] args) {

        Vegetables vegetables1 = new Vegetables();
        vegetables1.color();
        vegetables1.kg();
        vegetables1.size();
        vegetables1.origin();
        vegetables1.price();
        System.out.println("----------------------");

        Vegetables vegetables2 = new VegetablesDetails();
        vegetables2.color();
        vegetables2.kg();
        vegetables2.size();
        vegetables2.origin();
        vegetables2.price();
        System.out.println("----------------------");

        VegetablesDetails vegetables3 = new VegetablesDetails();
        vegetables3.color();
        vegetables3.kg();
        vegetables3.size();
        vegetables3.origin();
        vegetables3.price();
        vegetables3.extraMethod();
        System.out.println("----------------------");

        VegetablesCast caster = new VegetablesCast();
        caster.cast(vegetables2);
    }
}
