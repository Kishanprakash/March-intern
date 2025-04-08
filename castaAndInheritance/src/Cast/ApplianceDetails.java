package Cast;

public class ApplianceDetails extends Appliance {
    @Override
    public void plugIn() {
        System.out.println("Overridden: plugIn in ApplianceDetails");
    }

    @Override
    public void unplug() {
        System.out.println("Overridden: unplug in ApplianceDetails");
    }

    @Override
    public void operate() {
        System.out.println("Overridden: operate in ApplianceDetails");
    }

    @Override
    public void maintain() {
        System.out.println("Overridden: maintain in ApplianceDetails");
    }

    @Override
    public void repair() {
        System.out.println("Overridden: repair in ApplianceDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ApplianceDetails");
    }
}
