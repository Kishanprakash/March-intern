package Cast;

public class OilseedsDetails extends Oilseeds {
    @Override
    public void color() {
        System.out.println("Overridden: color in OilseedsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in OilseedsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in OilseedsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in OilseedsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in OilseedsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in OilseedsDetails");
    }
}
