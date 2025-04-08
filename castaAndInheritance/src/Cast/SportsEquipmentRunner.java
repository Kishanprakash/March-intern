package Cast;

public class SportsEquipmentRunner {
    public static void main(String[] args) {

        SportsEquipment sportsEquipment1 = new SportsEquipment();
        sportsEquipment1.use();
        sportsEquipment1.store();
        sportsEquipment1.clean();
        sportsEquipment1.repair();
        sportsEquipment1.upgrade();
        System.out.println("----------------------");

        SportsEquipment sportsEquipment2 = new SportsEquipmentDetails();
        sportsEquipment2.use();
        sportsEquipment2.store();
        sportsEquipment2.clean();
        sportsEquipment2.repair();
        sportsEquipment2.upgrade();
        System.out.println("----------------------");

        SportsEquipmentDetails sportsEquipment3 = new SportsEquipmentDetails();
        sportsEquipment3.use();
        sportsEquipment3.store();
        sportsEquipment3.clean();
        sportsEquipment3.repair();
        sportsEquipment3.upgrade();
        sportsEquipment3.extraMethod();
        System.out.println("----------------------");

        SportsEquipmentCast caster = new SportsEquipmentCast();
        caster.cast(sportsEquipment2);
    }
}
