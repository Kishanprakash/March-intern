package Cast;

public class DriedFruitsCast {
    public void cast(DriedFruits driedFruits) {
        System.out.println("Casting DriedFruits");
        driedFruits.color();
        driedFruits.kg();
        driedFruits.size();
        driedFruits.origin();
        driedFruits.price();
        if(driedFruits instanceof DriedFruitsDetails) {
            DriedFruitsDetails ref = (DriedFruitsDetails)driedFruits;
            ref.extraMethod();
        }
    }
}
