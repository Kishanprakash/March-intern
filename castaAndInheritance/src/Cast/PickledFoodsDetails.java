package Cast;

public class PickledFoodsDetails extends PickledFoods {
    @Override
    public void color() {
        System.out.println("Overridden: color in PickledFoodsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in PickledFoodsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in PickledFoodsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in PickledFoodsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in PickledFoodsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in PickledFoodsDetails");
    }
}
