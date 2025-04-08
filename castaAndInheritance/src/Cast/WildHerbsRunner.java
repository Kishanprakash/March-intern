package Cast;

public class WildHerbsRunner {
    public static void main(String[] args) {

        WildHerbs wildHerbs1 = new WildHerbs();
        wildHerbs1.color();
        wildHerbs1.kg();
        wildHerbs1.size();
        wildHerbs1.origin();
        wildHerbs1.price();
        System.out.println("----------------------");

        WildHerbs wildHerbs2 = new WildHerbsDetails();
        wildHerbs2.color();
        wildHerbs2.kg();
        wildHerbs2.size();
        wildHerbs2.origin();
        wildHerbs2.price();
        System.out.println("----------------------");

        WildHerbsDetails wildHerbs3 = new WildHerbsDetails();
        wildHerbs3.color();
        wildHerbs3.kg();
        wildHerbs3.size();
        wildHerbs3.origin();
        wildHerbs3.price();
        wildHerbs3.extraMethod();
        System.out.println("----------------------");

        WildHerbsCast caster = new WildHerbsCast();
        caster.cast(wildHerbs2);
    }
}
