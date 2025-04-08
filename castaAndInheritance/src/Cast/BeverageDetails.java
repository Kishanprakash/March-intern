package Cast;

public class BeverageDetails extends Beverage {
    @Override
    public void drink() {
        System.out.println("Overridden: drink in BeverageDetails");
    }

    @Override
    public void pour() {
        System.out.println("Overridden: pour in BeverageDetails");
    }

    @Override
    public void chill() {
        System.out.println("Overridden: chill in BeverageDetails");
    }

    @Override
    public void store() {
        System.out.println("Overridden: store in BeverageDetails");
    }

    @Override
    public void serve() {
        System.out.println("Overridden: serve in BeverageDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BeverageDetails");
    }
}
