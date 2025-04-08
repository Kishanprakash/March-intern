package Cast;

public class JewelryDetails extends Jewelry {
    @Override
    public void wear() {
        System.out.println("Overridden: wear in JewelryDetails");
    }

    @Override
    public void polish() {
        System.out.println("Overridden: polish in JewelryDetails");
    }

    @Override
    public void clean() {
        System.out.println("Overridden: clean in JewelryDetails");
    }

    @Override
    public void store() {
        System.out.println("Overridden: store in JewelryDetails");
    }

    @Override
    public void appraise() {
        System.out.println("Overridden: appraise in JewelryDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in JewelryDetails");
    }
}
