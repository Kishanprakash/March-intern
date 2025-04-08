package Cast;

public class GameMeatDetails extends GameMeat {
    @Override
    public void color() {
        System.out.println("Overridden: color in GameMeatDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in GameMeatDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in GameMeatDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in GameMeatDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in GameMeatDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in GameMeatDetails");
    }
}
