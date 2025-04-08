package Cast;

public class BerriesCast {
    public void cast(Berries berries) {
        System.out.println("Casting Berries");
        berries.color();
        berries.kg();
        berries.size();
        berries.origin();
        berries.price();
        if(berries instanceof BerriesDetails) {
            BerriesDetails ref = (BerriesDetails)berries;
            ref.extraMethod();
        }
    }
}
