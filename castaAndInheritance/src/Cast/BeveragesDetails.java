package Cast;

public class BeveragesDetails extends Beverages {
    @Override
    public void temperature() {
        System.out.println("Overridden: temperature in BeveragesDetails");
    }

    @Override
    public void volume() {
        System.out.println("Overridden: volume in BeveragesDetails");
    }

    @Override
    public void brand() {
        System.out.println("Overridden: brand in BeveragesDetails");
    }

    @Override
    public void ingredients() {
        System.out.println("Overridden: ingredients in BeveragesDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in BeveragesDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BeveragesDetails");
    }
}
