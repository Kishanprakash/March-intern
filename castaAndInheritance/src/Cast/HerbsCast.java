package Cast;

public class HerbsCast {
    public void cast(Herbs herbs) {
        System.out.println("Casting Herbs");
        herbs.type();
        herbs.aroma();
        herbs.medicinalValue();
        herbs.origin();
        herbs.price();
        if(herbs instanceof HerbsDetails) {
            HerbsDetails ref = (HerbsDetails)herbs;
            ref.extraMethod();
        }
    }
}
