package Cast;

public class FruitsCast {
    public void cast(Fruits fruits) {
        System.out.println("Casting Fruits");
        fruits.color();
        fruits.kg();
        fruits.size();
        fruits.origin();
        fruits.price();
        if(fruits instanceof FruitsDetails) {
            FruitsDetails ref = (FruitsDetails)fruits;
            ref.extraMethod();
        }
    }
}
