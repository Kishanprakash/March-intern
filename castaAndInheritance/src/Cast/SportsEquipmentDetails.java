package Cast;

public class SportsEquipmentDetails extends SportsEquipment {
    @Override
    public void use() {
        System.out.println("Overridden: use in SportsEquipmentDetails");
    }

    @Override
    public void store() {
        System.out.println("Overridden: store in SportsEquipmentDetails");
    }

    @Override
    public void clean() {
        System.out.println("Overridden: clean in SportsEquipmentDetails");
    }

    @Override
    public void repair() {
        System.out.println("Overridden: repair in SportsEquipmentDetails");
    }

    @Override
    public void upgrade() {
        System.out.println("Overridden: upgrade in SportsEquipmentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in SportsEquipmentDetails");
    }
}
