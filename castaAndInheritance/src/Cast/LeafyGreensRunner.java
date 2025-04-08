package Cast;

public class LeafyGreensRunner {
    public static void main(String[] args) {

        LeafyGreens leafyGreens1 = new LeafyGreens();
        leafyGreens1.color();
        leafyGreens1.kg();
        leafyGreens1.size();
        leafyGreens1.origin();
        leafyGreens1.price();
        System.out.println("----------------------");

        LeafyGreens leafyGreens2 = new LeafyGreensDetails();
        leafyGreens2.color();
        leafyGreens2.kg();
        leafyGreens2.size();
        leafyGreens2.origin();
        leafyGreens2.price();
        System.out.println("----------------------");

        LeafyGreensDetails leafyGreens3 = new LeafyGreensDetails();
        leafyGreens3.color();
        leafyGreens3.kg();
        leafyGreens3.size();
        leafyGreens3.origin();
        leafyGreens3.price();
        leafyGreens3.extraMethod();
        System.out.println("----------------------");

        LeafyGreensCast caster = new LeafyGreensCast();
        caster.cast(leafyGreens2);
    }
}
