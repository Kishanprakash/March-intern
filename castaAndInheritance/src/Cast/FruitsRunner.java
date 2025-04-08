package Cast;

public class FruitsRunner {
    public static void main(String[] args) {

        Fruits fruits1 = new Fruits();
        fruits1.color();
        fruits1.kg();
        fruits1.size();
        fruits1.origin();
        fruits1.price();
        System.out.println("----------------------");

        Fruits fruits2 = new FruitsDetails();
        fruits2.color();
        fruits2.kg();
        fruits2.size();
        fruits2.origin();
        fruits2.price();
        System.out.println("----------------------");

        FruitsDetails fruits3 = new FruitsDetails();
        fruits3.color();
        fruits3.kg();
        fruits3.size();
        fruits3.origin();
        fruits3.price();
        fruits3.extraMethod();
        System.out.println("----------------------");

        FruitsCast caster = new FruitsCast();
        caster.cast(fruits2);
    }
}
