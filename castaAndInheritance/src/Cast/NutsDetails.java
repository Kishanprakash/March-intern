package Cast;

public class NutsDetails extends Nuts {
    @Override
    public void type() {
        System.out.println("Overridden: type in NutsDetails");
    }

    @Override
    public void crunchiness() {
        System.out.println("Overridden: crunchiness in NutsDetails");
    }

    @Override
    public void nutritionalValue() {
        System.out.println("Overridden: nutritionalValue in NutsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in NutsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in NutsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in NutsDetails");
    }
}
