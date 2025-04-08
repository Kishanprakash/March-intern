package Cast;

public class HomeApplianceRunner {
    public static void main(String[] args) {

        HomeAppliance homeAppliance1 = new HomeAppliance();
        homeAppliance1.install();
        homeAppliance1.operate();
        homeAppliance1.clean();
        homeAppliance1.maintain();
        homeAppliance1.replace();
        System.out.println("----------------------");

        HomeAppliance homeAppliance2 = new HomeApplianceDetails();
        homeAppliance2.install();
        homeAppliance2.operate();
        homeAppliance2.clean();
        homeAppliance2.maintain();
        homeAppliance2.replace();
        System.out.println("----------------------");

        HomeApplianceDetails homeAppliance3 = new HomeApplianceDetails();
        homeAppliance3.install();
        homeAppliance3.operate();
        homeAppliance3.clean();
        homeAppliance3.maintain();
        homeAppliance3.replace();
        homeAppliance3.extraMethod();
        System.out.println("----------------------");

        HomeApplianceCast caster = new HomeApplianceCast();
        caster.cast(homeAppliance2);
    }
}
