package Cast;

public class DairyDetails extends Dairy {
    @Override
    public void fatContent() {
        System.out.println("Overridden: fatContent in DairyDetails");
    }

    @Override
    public void liters() {
        System.out.println("Overridden: liters in DairyDetails");
    }

    @Override
    public void expiryDate() {
        System.out.println("Overridden: expiryDate in DairyDetails");
    }

    @Override
    public void brand() {
        System.out.println("Overridden: brand in DairyDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in DairyDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in DairyDetails");
    }
}
