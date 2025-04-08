package Cast;

public class LegumesCast {
    public void cast(Legumes legumes) {
        System.out.println("Casting Legumes");
        legumes.color();
        legumes.kg();
        legumes.size();
        legumes.origin();
        legumes.price();
        if(legumes instanceof LegumesDetails) {
            LegumesDetails ref = (LegumesDetails)legumes;
            ref.extraMethod();
        }
    }
}
