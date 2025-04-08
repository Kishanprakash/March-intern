package Cast;

public class VegetablesDetails extends Vegetables {
    @Override
    public void color() {
        System.out.println("Overridden: color in VegetablesDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in VegetablesDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in VegetablesDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in VegetablesDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in VegetablesDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in VegetablesDetails");
    }
}
