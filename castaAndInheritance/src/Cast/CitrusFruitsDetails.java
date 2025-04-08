package Cast;

public class CitrusFruitsDetails extends CitrusFruits {
    @Override
    public void color() {
        System.out.println("Overridden: color in CitrusFruitsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in CitrusFruitsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in CitrusFruitsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in CitrusFruitsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in CitrusFruitsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CitrusFruitsDetails");
    }
}
