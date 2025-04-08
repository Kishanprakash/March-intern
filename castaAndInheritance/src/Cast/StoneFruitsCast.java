package Cast;

public class StoneFruitsCast {
    public void cast(StoneFruits stoneFruits) {
        System.out.println("Casting StoneFruits");
        stoneFruits.color();
        stoneFruits.kg();
        stoneFruits.size();
        stoneFruits.origin();
        stoneFruits.price();
        if(stoneFruits instanceof StoneFruitsDetails) {
            StoneFruitsDetails ref = (StoneFruitsDetails)stoneFruits;
            ref.extraMethod();
        }
    }
}
