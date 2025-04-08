package Cast;

public class MushroomsDetails extends Mushrooms {
    @Override
    public void color() {
        System.out.println("Overridden: color in MushroomsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in MushroomsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in MushroomsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in MushroomsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in MushroomsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MushroomsDetails");
    }
}
