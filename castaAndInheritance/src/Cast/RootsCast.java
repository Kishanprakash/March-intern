package Cast;

public class RootsCast {
    public void cast(Roots roots) {
        System.out.println("Casting Roots");
        roots.color();
        roots.kg();
        roots.size();
        roots.origin();
        roots.price();
        if(roots instanceof RootsDetails) {
            RootsDetails ref = (RootsDetails)roots;
            ref.extraMethod();
        }
    }
}
