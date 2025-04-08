package Cast;

public class ApplianceRunner {
    public static void main(String[] args) {

        Appliance appliance1 = new Appliance();
        appliance1.plugIn();
        appliance1.unplug();
        appliance1.operate();
        appliance1.maintain();
        appliance1.repair();
        System.out.println("----------------------");

        Appliance appliance2 = new ApplianceDetails();
        appliance2.plugIn();
        appliance2.unplug();
        appliance2.operate();
        appliance2.maintain();
        appliance2.repair();
        System.out.println("----------------------");

        ApplianceDetails appliance3 = new ApplianceDetails();
        appliance3.plugIn();
        appliance3.unplug();
        appliance3.operate();
        appliance3.maintain();
        appliance3.repair();
        appliance3.extraMethod();
        System.out.println("----------------------");

        ApplianceCast caster = new ApplianceCast();
        caster.cast(appliance2);
    }
}
