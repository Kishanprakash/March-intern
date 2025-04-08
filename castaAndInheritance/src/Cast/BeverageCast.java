package Cast;

public class BeverageCast {
    public void cast(Beverage beverage) {
        System.out.println("Casting Beverage");
        beverage.drink();
        beverage.pour();
        beverage.chill();
        beverage.store();
        beverage.serve();
        if(beverage instanceof BeverageDetails) {
            BeverageDetails ref = (BeverageDetails)beverage;
            ref.extraMethod();
        }
    }
}
