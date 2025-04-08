package Cast;

public class BakeryCast {
    public void cast(Bakery bakery) {
        System.out.println("Casting Bakery");
        bakery.type();
        bakery.sweetness();
        bakery.ingredients();
        bakery.origin();
        bakery.price();
        if(bakery instanceof BakeryDetails) {
            BakeryDetails ref = (BakeryDetails)bakery;
            ref.extraMethod();
        }
    }
}
