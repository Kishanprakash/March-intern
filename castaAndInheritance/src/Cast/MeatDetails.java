package Cast;

public class MeatDetails extends Meat {
    @Override
    public void type() {
        System.out.println("Overridden: type in MeatDetails");
    }

    @Override
    public void weight() {
        System.out.println("Overridden: weight in MeatDetails");
    }

    @Override
    public void freshness() {
        System.out.println("Overridden: freshness in MeatDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in MeatDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in MeatDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MeatDetails");
    }
}
