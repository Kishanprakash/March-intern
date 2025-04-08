package Cast;

public class AnimalRunner {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.eat();
        animal1.sleep();
        animal1.move();
        animal1.breathe();
        animal1.reproduce();
        System.out.println("----------------------");

        Animal animal2 = new AnimalDetails();
        animal2.eat();
        animal2.sleep();
        animal2.move();
        animal2.breathe();
        animal2.reproduce();
        System.out.println("----------------------");

        AnimalDetails animal3 = new AnimalDetails();
        animal3.eat();
        animal3.sleep();
        animal3.move();
        animal3.breathe();
        animal3.reproduce();
        animal3.extraMethod();
        System.out.println("----------------------");

        AnimalCast caster = new AnimalCast();
        caster.cast(animal2);
    }
}
