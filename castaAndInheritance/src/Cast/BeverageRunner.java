package Cast;

public class BeverageRunner {
    public static void main(String[] args) {

        Beverage beverage1 = new Beverage();
        beverage1.drink();
        beverage1.pour();
        beverage1.chill();
        beverage1.store();
        beverage1.serve();
        System.out.println("----------------------");

        Beverage beverage2 = new BeverageDetails();
        beverage2.drink();
        beverage2.pour();
        beverage2.chill();
        beverage2.store();
        beverage2.serve();
        System.out.println("----------------------");

        BeverageDetails beverage3 = new BeverageDetails();
        beverage3.drink();
        beverage3.pour();
        beverage3.chill();
        beverage3.store();
        beverage3.serve();
        beverage3.extraMethod();
        System.out.println("----------------------");

        BeverageCast caster = new BeverageCast();
        caster.cast(beverage2);
    }
}
