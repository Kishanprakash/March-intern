package Cast;

public class SeafoodRunner {
    public static void main(String[] args) {

        Seafood seafood1 = new Seafood();
        seafood1.species();
        seafood1.weight();
        seafood1.freshness();
        seafood1.origin();
        seafood1.price();
        System.out.println("----------------------");

        Seafood seafood2 = new SeafoodDetails();
        seafood2.species();
        seafood2.weight();
        seafood2.freshness();
        seafood2.origin();
        seafood2.price();
        System.out.println("----------------------");

        SeafoodDetails seafood3 = new SeafoodDetails();
        seafood3.species();
        seafood3.weight();
        seafood3.freshness();
        seafood3.origin();
        seafood3.price();
        seafood3.extraMethod();
        System.out.println("----------------------");

        SeafoodCast caster = new SeafoodCast();
        caster.cast(seafood2);
    }
}
