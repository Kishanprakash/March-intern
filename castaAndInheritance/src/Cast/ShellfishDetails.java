package Cast;

public class ShellfishDetails extends Shellfish {
    @Override
    public void color() {
        System.out.println("Overridden: color in ShellfishDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in ShellfishDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in ShellfishDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in ShellfishDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in ShellfishDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ShellfishDetails");
    }
}
