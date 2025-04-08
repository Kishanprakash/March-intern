package Cast;

public class MelonsDetails extends Melons {
    @Override
    public void color() {
        System.out.println("Overridden: color in MelonsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in MelonsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in MelonsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in MelonsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in MelonsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MelonsDetails");
    }
}
