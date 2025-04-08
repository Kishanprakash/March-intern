package Cast;

public class EdibleSeedsRunner {
    public static void main(String[] args) {

        EdibleSeeds edibleSeeds1 = new EdibleSeeds();
        edibleSeeds1.color();
        edibleSeeds1.kg();
        edibleSeeds1.size();
        edibleSeeds1.origin();
        edibleSeeds1.price();
        System.out.println("----------------------");

        EdibleSeeds edibleSeeds2 = new EdibleSeedsDetails();
        edibleSeeds2.color();
        edibleSeeds2.kg();
        edibleSeeds2.size();
        edibleSeeds2.origin();
        edibleSeeds2.price();
        System.out.println("----------------------");

        EdibleSeedsDetails edibleSeeds3 = new EdibleSeedsDetails();
        edibleSeeds3.color();
        edibleSeeds3.kg();
        edibleSeeds3.size();
        edibleSeeds3.origin();
        edibleSeeds3.price();
        edibleSeeds3.extraMethod();
        System.out.println("----------------------");

        EdibleSeedsCast caster = new EdibleSeedsCast();
        caster.cast(edibleSeeds2);
    }
}
