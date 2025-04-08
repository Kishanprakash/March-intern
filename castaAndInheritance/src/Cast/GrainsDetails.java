package Cast;

public class GrainsDetails extends Grains {
    @Override
    public void type() {
        System.out.println("Overridden: type in GrainsDetails");
    }

    @Override
    public void weight() {
        System.out.println("Overridden: weight in GrainsDetails");
    }

    @Override
    public void nutritionalValue() {
        System.out.println("Overridden: nutritionalValue in GrainsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in GrainsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in GrainsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in GrainsDetails");
    }
}
