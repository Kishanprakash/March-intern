package Cast;

public class SpicesDetails extends Spices {
    @Override
    public void type() {
        System.out.println("Overridden: type in SpicesDetails");
    }

    @Override
    public void aroma() {
        System.out.println("Overridden: aroma in SpicesDetails");
    }

    @Override
    public void heatLevel() {
        System.out.println("Overridden: heatLevel in SpicesDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in SpicesDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in SpicesDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in SpicesDetails");
    }
}
