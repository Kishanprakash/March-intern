package Cast;

public class AnimalDetails extends Animal {
    @Override
    public void eat() {
        System.out.println("Overridden: eat in AnimalDetails");
    }

    @Override
    public void sleep() {
        System.out.println("Overridden: sleep in AnimalDetails");
    }

    @Override
    public void move() {
        System.out.println("Overridden: move in AnimalDetails");
    }

    @Override
    public void breathe() {
        System.out.println("Overridden: breathe in AnimalDetails");
    }

    @Override
    public void reproduce() {
        System.out.println("Overridden: reproduce in AnimalDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in AnimalDetails");
    }
}
