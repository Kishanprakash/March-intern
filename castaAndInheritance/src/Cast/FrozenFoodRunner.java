package Cast;

public class FrozenFoodRunner {
    public static void main(String[] args) {

        FrozenFood frozenFood1 = new FrozenFood();
        frozenFood1.category();
        frozenFood1.storageTemp();
        frozenFood1.expiryDate();
        frozenFood1.origin();
        frozenFood1.price();
        System.out.println("----------------------");

        FrozenFood frozenFood2 = new FrozenFoodDetails();
        frozenFood2.category();
        frozenFood2.storageTemp();
        frozenFood2.expiryDate();
        frozenFood2.origin();
        frozenFood2.price();
        System.out.println("----------------------");

        FrozenFoodDetails frozenFood3 = new FrozenFoodDetails();
        frozenFood3.category();
        frozenFood3.storageTemp();
        frozenFood3.expiryDate();
        frozenFood3.origin();
        frozenFood3.price();
        frozenFood3.extraMethod();
        System.out.println("----------------------");

        FrozenFoodCast caster = new FrozenFoodCast();
        caster.cast(frozenFood2);
    }
}
