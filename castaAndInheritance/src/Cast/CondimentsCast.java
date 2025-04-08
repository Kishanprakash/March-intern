package Cast;

public class CondimentsCast {
    public void cast(Condiments condiments) {
        System.out.println("Casting Condiments");
        condiments.color();
        condiments.kg();
        condiments.size();
        condiments.origin();
        condiments.price();
        if(condiments instanceof CondimentsDetails) {
            CondimentsDetails ref = (CondimentsDetails)condiments;
            ref.extraMethod();
        }
    }
}
