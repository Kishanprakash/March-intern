package Cast;

public class ApplianceCast {
    public void cast(Appliance appliance) {
        System.out.println("Casting Appliance");
        appliance.plugIn();
        appliance.unplug();
        appliance.operate();
        appliance.maintain();
        appliance.repair();
        if(appliance instanceof ApplianceDetails) {
            ApplianceDetails ref = (ApplianceDetails)appliance;
            ref.extraMethod();
        }
    }
}
