package Cast;

public class EdibleSeedsDetails extends EdibleSeeds {
    @Override
    public void color() {
        System.out.println("Overridden: color in EdibleSeedsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in EdibleSeedsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in EdibleSeedsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in EdibleSeedsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in EdibleSeedsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in EdibleSeedsDetails");
    }
}
