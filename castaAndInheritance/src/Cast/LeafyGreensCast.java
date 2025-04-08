package Cast;

public class LeafyGreensCast {
    public void cast(LeafyGreens leafyGreens) {
        System.out.println("Casting LeafyGreens");
        leafyGreens.color();
        leafyGreens.kg();
        leafyGreens.size();
        leafyGreens.origin();
        leafyGreens.price();
        if(leafyGreens instanceof LeafyGreensDetails) {
            LeafyGreensDetails ref = (LeafyGreensDetails)leafyGreens;
            ref.extraMethod();
        }
    }
}
