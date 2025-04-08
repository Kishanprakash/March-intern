package Cast;

public class BuildingDetails extends Building {
    @Override
    public void construct() {
        System.out.println("Overridden: construct in BuildingDetails");
    }

    @Override
    public void demolish() {
        System.out.println("Overridden: demolish in BuildingDetails");
    }

    @Override
    public void paint() {
        System.out.println("Overridden: paint in BuildingDetails");
    }

    @Override
    public void renovate() {
        System.out.println("Overridden: renovate in BuildingDetails");
    }

    @Override
    public void occupy() {
        System.out.println("Overridden: occupy in BuildingDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BuildingDetails");
    }
}
