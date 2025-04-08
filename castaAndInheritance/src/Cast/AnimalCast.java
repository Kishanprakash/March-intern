package Cast;

public class AnimalCast {
    public void cast(Animal animal) {
        System.out.println("Casting Animal");
        animal.eat();
        animal.sleep();
        animal.move();
        animal.breathe();
        animal.reproduce();
        if(animal instanceof AnimalDetails) {
            AnimalDetails ref = (AnimalDetails)animal;
            ref.extraMethod();
        }
    }
}
