package Cast;

public class TrafficDetails extends Traffic {
    @Override
    public void color() {
        System.out.println("Overridden: color in TrafficDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in TrafficDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in TrafficDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in TrafficDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in TrafficDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TrafficDetails");
    }
}
