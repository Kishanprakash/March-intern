package Cast;

public class GrainsCast {
    public void cast(Grains grains) {
        System.out.println("Casting Grains");
        grains.type();
        grains.weight();
        grains.nutritionalValue();
        grains.origin();
        grains.price();
        if(grains instanceof GrainsDetails) {
            GrainsDetails ref = (GrainsDetails)grains;
            ref.extraMethod();
        }
    }
}
