package Cast;

public class SeaweedDetails extends Seaweed {
    @Override
    public void color() {
        System.out.println("Overridden: color in SeaweedDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in SeaweedDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in SeaweedDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in SeaweedDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in SeaweedDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in SeaweedDetails");
    }
}
