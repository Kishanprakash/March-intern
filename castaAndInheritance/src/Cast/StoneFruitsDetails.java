package Cast;

public class StoneFruitsDetails extends StoneFruits {
    @Override
    public void color() {
        System.out.println("Overridden: color in StoneFruitsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in StoneFruitsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in StoneFruitsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in StoneFruitsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in StoneFruitsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in StoneFruitsDetails");
    }
}
