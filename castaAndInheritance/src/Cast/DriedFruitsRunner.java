package Cast;

public class DriedFruitsRunner {
    public static void main(String[] args) {

        DriedFruits driedFruits1 = new DriedFruits();
        driedFruits1.color();
        driedFruits1.kg();
        driedFruits1.size();
        driedFruits1.origin();
        driedFruits1.price();
        System.out.println("----------------------");

        DriedFruits driedFruits2 = new DriedFruitsDetails();
        driedFruits2.color();
        driedFruits2.kg();
        driedFruits2.size();
        driedFruits2.origin();
        driedFruits2.price();
        System.out.println("----------------------");

        DriedFruitsDetails driedFruits3 = new DriedFruitsDetails();
        driedFruits3.color();
        driedFruits3.kg();
        driedFruits3.size();
        driedFruits3.origin();
        driedFruits3.price();
        driedFruits3.extraMethod();
        System.out.println("----------------------");

        DriedFruitsCast caster = new DriedFruitsCast();
        caster.cast(driedFruits2);
    }
}
