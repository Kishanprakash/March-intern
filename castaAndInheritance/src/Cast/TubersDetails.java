package Cast;

public class TubersDetails extends Tubers {
    @Override
    public void color() {
        System.out.println("Overridden: color in TubersDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in TubersDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in TubersDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in TubersDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in TubersDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TubersDetails");
    }
}
