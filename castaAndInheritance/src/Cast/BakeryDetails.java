package Cast;

public class BakeryDetails extends Bakery {
    @Override
    public void type() {
        System.out.println("Overridden: type in BakeryDetails");
    }

    @Override
    public void sweetness() {
        System.out.println("Overridden: sweetness in BakeryDetails");
    }

    @Override
    public void ingredients() {
        System.out.println("Overridden: ingredients in BakeryDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in BakeryDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in BakeryDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BakeryDetails");
    }
}
