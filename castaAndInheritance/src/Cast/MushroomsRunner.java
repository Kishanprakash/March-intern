package Cast;

public class MushroomsRunner {
    public static void main(String[] args) {

        Mushrooms mushrooms1 = new Mushrooms();
        mushrooms1.color();
        mushrooms1.kg();
        mushrooms1.size();
        mushrooms1.origin();
        mushrooms1.price();
        System.out.println("----------------------");

        Mushrooms mushrooms2 = new MushroomsDetails();
        mushrooms2.color();
        mushrooms2.kg();
        mushrooms2.size();
        mushrooms2.origin();
        mushrooms2.price();
        System.out.println("----------------------");

        MushroomsDetails mushrooms3 = new MushroomsDetails();
        mushrooms3.color();
        mushrooms3.kg();
        mushrooms3.size();
        mushrooms3.origin();
        mushrooms3.price();
        mushrooms3.extraMethod();
        System.out.println("----------------------");

        MushroomsCast caster = new MushroomsCast();
        caster.cast(mushrooms2);
    }
}
