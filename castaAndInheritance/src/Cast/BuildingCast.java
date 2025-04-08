package Cast;

public class BuildingCast {
    public void cast(Building building) {
        System.out.println("Casting Building");
        building.construct();
        building.demolish();
        building.paint();
        building.renovate();
        building.occupy();
        if(building instanceof BuildingDetails) {
            BuildingDetails ref = (BuildingDetails)building;
            ref.extraMethod();
        }
    }
}
