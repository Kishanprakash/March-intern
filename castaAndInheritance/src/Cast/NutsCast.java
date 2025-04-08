package Cast;

public class NutsCast {
    public void cast(Nuts nuts) {
        System.out.println("Casting Nuts");
        nuts.type();
        nuts.crunchiness();
        nuts.nutritionalValue();
        nuts.origin();
        nuts.price();
        if(nuts instanceof NutsDetails) {
            NutsDetails ref = (NutsDetails)nuts;
            ref.extraMethod();
        }
    }
}
