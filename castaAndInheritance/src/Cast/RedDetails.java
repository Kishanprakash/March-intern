package Cast;

public class RedDetails extends Red {
    @Override
    public void color() {
        System.out.println("Overridden: color in RedDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in RedDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in RedDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in RedDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in RedDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in RedDetails");
    }
}
