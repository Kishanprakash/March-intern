package Cast;

public class EdibleSeedsCast {
    public void cast(EdibleSeeds edibleSeeds) {
        System.out.println("Casting EdibleSeeds");
        edibleSeeds.color();
        edibleSeeds.kg();
        edibleSeeds.size();
        edibleSeeds.origin();
        edibleSeeds.price();
        if(edibleSeeds instanceof EdibleSeedsDetails) {
            EdibleSeedsDetails ref = (EdibleSeedsDetails)edibleSeeds;
            ref.extraMethod();
        }
    }
}
