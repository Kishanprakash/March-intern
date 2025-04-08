package Cast;

public class HomeApplianceCast {
    public void cast(HomeAppliance homeAppliance) {
        System.out.println("Casting HomeAppliance");
        homeAppliance.install();
        homeAppliance.operate();
        homeAppliance.clean();
        homeAppliance.maintain();
        homeAppliance.replace();
        if(homeAppliance instanceof HomeApplianceDetails) {
            HomeApplianceDetails ref = (HomeApplianceDetails)homeAppliance;
            ref.extraMethod();
        }
    }
}
