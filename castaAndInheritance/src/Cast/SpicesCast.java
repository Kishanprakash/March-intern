package Cast;

public class SpicesCast {
    public void cast(Spices spices) {
        System.out.println("Casting Spices");
        spices.type();
        spices.aroma();
        spices.heatLevel();
        spices.origin();
        spices.price();
        if(spices instanceof SpicesDetails) {
            SpicesDetails ref = (SpicesDetails)spices;
            ref.extraMethod();
        }
    }
}
