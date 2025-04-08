package Cast;

public class HerbsDetails extends Herbs {
    @Override
    public void type() {
        System.out.println("Overridden: type in HerbsDetails");
    }

    @Override
    public void aroma() {
        System.out.println("Overridden: aroma in HerbsDetails");
    }

    @Override
    public void medicinalValue() {
        System.out.println("Overridden: medicinalValue in HerbsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in HerbsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in HerbsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in HerbsDetails");
    }
}
