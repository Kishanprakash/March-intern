package Cast;

public class SeafoodCast {
    public void cast(Seafood seafood) {
        System.out.println("Casting Seafood");
        seafood.species();
        seafood.weight();
        seafood.freshness();
        seafood.origin();
        seafood.price();
        if(seafood instanceof SeafoodDetails) {
            SeafoodDetails ref = (SeafoodDetails)seafood;
            ref.extraMethod();
        }
    }
}
