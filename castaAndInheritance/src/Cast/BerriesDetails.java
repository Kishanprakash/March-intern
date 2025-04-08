package Cast;

public class BerriesDetails extends Berries {
    @Override
    public void color() {
        System.out.println("Overridden: color in BerriesDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in BerriesDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in BerriesDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in BerriesDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in BerriesDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BerriesDetails");
    }
}
