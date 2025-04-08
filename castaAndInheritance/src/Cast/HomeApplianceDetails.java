package Cast;

public class HomeApplianceDetails extends HomeAppliance {
    @Override
    public void install() {
        System.out.println("Overridden: install in HomeApplianceDetails");
    }

    @Override
    public void operate() {
        System.out.println("Overridden: operate in HomeApplianceDetails");
    }

    @Override
    public void clean() {
        System.out.println("Overridden: clean in HomeApplianceDetails");
    }

    @Override
    public void maintain() {
        System.out.println("Overridden: maintain in HomeApplianceDetails");
    }

    @Override
    public void replace() {
        System.out.println("Overridden: replace in HomeApplianceDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in HomeApplianceDetails");
    }
}
