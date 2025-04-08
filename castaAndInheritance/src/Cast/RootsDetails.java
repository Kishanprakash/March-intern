package Cast;

public class RootsDetails extends Roots {
    @Override
    public void color() {
        System.out.println("Overridden: color in RootsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in RootsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in RootsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in RootsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in RootsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in RootsDetails");
    }
}
