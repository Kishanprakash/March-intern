package Cast;

public class LegumesDetails extends Legumes {
    @Override
    public void color() {
        System.out.println("Overridden: color in LegumesDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in LegumesDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in LegumesDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in LegumesDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in LegumesDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in LegumesDetails");
    }
}
