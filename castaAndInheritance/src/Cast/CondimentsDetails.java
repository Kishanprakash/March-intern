package Cast;

public class CondimentsDetails extends Condiments {
    @Override
    public void color() {
        System.out.println("Overridden: color in CondimentsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in CondimentsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in CondimentsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in CondimentsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in CondimentsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CondimentsDetails");
    }
}
