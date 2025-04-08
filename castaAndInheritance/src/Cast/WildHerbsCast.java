package Cast;

public class WildHerbsCast {
    public void cast(WildHerbs wildHerbs) {
        System.out.println("Casting WildHerbs");
        wildHerbs.color();
        wildHerbs.kg();
        wildHerbs.size();
        wildHerbs.origin();
        wildHerbs.price();
        if(wildHerbs instanceof WildHerbsDetails) {
            WildHerbsDetails ref = (WildHerbsDetails)wildHerbs;
            ref.extraMethod();
        }
    }
}
