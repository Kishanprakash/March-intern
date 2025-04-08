package Cast;

public class MushroomsCast {
    public void cast(Mushrooms mushrooms) {
        System.out.println("Casting Mushrooms");
        mushrooms.color();
        mushrooms.kg();
        mushrooms.size();
        mushrooms.origin();
        mushrooms.price();
        if(mushrooms instanceof MushroomsDetails) {
            MushroomsDetails ref = (MushroomsDetails)mushrooms;
            ref.extraMethod();
        }
    }
}
