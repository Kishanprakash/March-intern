package Cast;

public class SportsEquipmentCast {
    public void cast(SportsEquipment sportsEquipment) {
        System.out.println("Casting SportsEquipment");
        sportsEquipment.use();
        sportsEquipment.store();
        sportsEquipment.clean();
        sportsEquipment.repair();
        sportsEquipment.upgrade();
        if(sportsEquipment instanceof SportsEquipmentDetails) {
            SportsEquipmentDetails ref = (SportsEquipmentDetails)sportsEquipment;
            ref.extraMethod();
        }
    }
}
