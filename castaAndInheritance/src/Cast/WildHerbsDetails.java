package Cast;

public class WildHerbsDetails extends WildHerbs {
    @Override
    public void color() {
        System.out.println("Overridden: color in WildHerbsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in WildHerbsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in WildHerbsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in WildHerbsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in WildHerbsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in WildHerbsDetails");
    }
}
