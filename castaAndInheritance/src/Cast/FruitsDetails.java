package Cast;

public class FruitsDetails extends Fruits {
    @Override
    public void color() {
        System.out.println("Overridden: color in FruitsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in FruitsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in FruitsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in FruitsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in FruitsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in FruitsDetails");
    }
}
