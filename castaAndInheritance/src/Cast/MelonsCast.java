package Cast;

public class MelonsCast {
    public void cast(Melons melons) {
        System.out.println("Casting Melons");
        melons.color();
        melons.kg();
        melons.size();
        melons.origin();
        melons.price();
        if(melons instanceof MelonsDetails) {
            MelonsDetails ref = (MelonsDetails)melons;
            ref.extraMethod();
        }
    }
}
