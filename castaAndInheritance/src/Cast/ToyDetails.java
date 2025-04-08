package Cast;

public class ToyDetails extends Toy {
    @Override
    public void playWith() {
        System.out.println("Overridden: playWith in ToyDetails");
    }

    @Override
    public void putAway() {
        System.out.println("Overridden: putAway in ToyDetails");
    }

    @Override
    public void clean() {
        System.out.println("Overridden: clean in ToyDetails");
    }

    @Override
    public void assemble() {
        System.out.println("Overridden: assemble in ToyDetails");
    }

    @Override
    public void giftWrap() {
        System.out.println("Overridden: giftWrap in ToyDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ToyDetails");
    }
}
