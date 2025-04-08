package Cast;

public class SweetenersDetails extends Sweeteners {
    @Override
    public void color() {
        System.out.println("Overridden: color in SweetenersDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in SweetenersDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in SweetenersDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in SweetenersDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in SweetenersDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in SweetenersDetails");
    }
}
