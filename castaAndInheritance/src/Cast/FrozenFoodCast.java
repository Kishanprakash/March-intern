package Cast;

public class FrozenFoodCast {
    public void cast(FrozenFood frozenFood) {
        System.out.println("Casting FrozenFood");
        frozenFood.category();
        frozenFood.storageTemp();
        frozenFood.expiryDate();
        frozenFood.origin();
        frozenFood.price();
        if(frozenFood instanceof FrozenFoodDetails) {
            FrozenFoodDetails ref = (FrozenFoodDetails)frozenFood;
            ref.extraMethod();
        }
    }
}
