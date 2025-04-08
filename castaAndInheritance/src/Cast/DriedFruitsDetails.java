package Cast;

public class DriedFruitsDetails extends DriedFruits {
    @Override
    public void color() {
        System.out.println("Overridden: color in DriedFruitsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in DriedFruitsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in DriedFruitsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in DriedFruitsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in DriedFruitsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in DriedFruitsDetails");
    }
}
