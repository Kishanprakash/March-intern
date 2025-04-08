package Cast;

public class SeafoodDetails extends Seafood {
    @Override
    public void species() {
        System.out.println("Overridden: species in SeafoodDetails");
    }

    @Override
    public void weight() {
        System.out.println("Overridden: weight in SeafoodDetails");
    }

    @Override
    public void freshness() {
        System.out.println("Overridden: freshness in SeafoodDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in SeafoodDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in SeafoodDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in SeafoodDetails");
    }
}
