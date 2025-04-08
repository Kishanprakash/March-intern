package Cast;

public class StoneFruitsRunner {
    public static void main(String[] args) {

        StoneFruits stoneFruits1 = new StoneFruits();
        stoneFruits1.color();
        stoneFruits1.kg();
        stoneFruits1.size();
        stoneFruits1.origin();
        stoneFruits1.price();
        System.out.println("----------------------");

        StoneFruits stoneFruits2 = new StoneFruitsDetails();
        stoneFruits2.color();
        stoneFruits2.kg();
        stoneFruits2.size();
        stoneFruits2.origin();
        stoneFruits2.price();
        System.out.println("----------------------");

        StoneFruitsDetails stoneFruits3 = new StoneFruitsDetails();
        stoneFruits3.color();
        stoneFruits3.kg();
        stoneFruits3.size();
        stoneFruits3.origin();
        stoneFruits3.price();
        stoneFruits3.extraMethod();
        System.out.println("----------------------");

        StoneFruitsCast caster = new StoneFruitsCast();
        caster.cast(stoneFruits2);
    }
}
