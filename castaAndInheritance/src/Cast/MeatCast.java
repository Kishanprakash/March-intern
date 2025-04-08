package Cast;

public class MeatCast {
    public void cast(Meat meat) {
        System.out.println("Casting Meat");
        meat.type();
        meat.weight();
        meat.freshness();
        meat.origin();
        meat.price();
        if(meat instanceof MeatDetails) {
            MeatDetails ref = (MeatDetails)meat;
            ref.extraMethod();
        }
    }
}
