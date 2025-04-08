package Cast;

public class RootsRunner {
    public static void main(String[] args) {

        Roots roots1 = new Roots();
        roots1.color();
        roots1.kg();
        roots1.size();
        roots1.origin();
        roots1.price();
        System.out.println("----------------------");

        Roots roots2 = new RootsDetails();
        roots2.color();
        roots2.kg();
        roots2.size();
        roots2.origin();
        roots2.price();
        System.out.println("----------------------");

        RootsDetails roots3 = new RootsDetails();
        roots3.color();
        roots3.kg();
        roots3.size();
        roots3.origin();
        roots3.price();
        roots3.extraMethod();
        System.out.println("----------------------");

        RootsCast caster = new RootsCast();
        caster.cast(roots2);
    }
}
