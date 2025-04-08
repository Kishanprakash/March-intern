package Cast;

public class FootwearDetails extends Footwear {
    @Override
    public void wear() {
        System.out.println("Overridden: wear in FootwearDetails");
    }

    @Override
    public void clean() {
        System.out.println("Overridden: clean in FootwearDetails");
    }

    @Override
    public void polish() {
        System.out.println("Overridden: polish in FootwearDetails");
    }

    @Override
    public void lace() {
        System.out.println("Overridden: lace in FootwearDetails");
    }

    @Override
    public void store() {
        System.out.println("Overridden: store in FootwearDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in FootwearDetails");
    }
}
