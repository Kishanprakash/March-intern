package Cast;

public class BuildingRunner {
    public static void main(String[] args) {

        Building building1 = new Building();
        building1.construct();
        building1.demolish();
        building1.paint();
        building1.renovate();
        building1.occupy();
        System.out.println("----------------------");

        Building building2 = new BuildingDetails();
        building2.construct();
        building2.demolish();
        building2.paint();
        building2.renovate();
        building2.occupy();
        System.out.println("----------------------");

        BuildingDetails building3 = new BuildingDetails();
        building3.construct();
        building3.demolish();
        building3.paint();
        building3.renovate();
        building3.occupy();
        building3.extraMethod();
        System.out.println("----------------------");

        BuildingCast caster = new BuildingCast();
        caster.cast(building2);
    }
}
