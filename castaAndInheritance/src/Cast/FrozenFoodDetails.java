package Cast;

public class FrozenFoodDetails extends FrozenFood {
    @Override
    public void category() {
        System.out.println("Overridden: category in FrozenFoodDetails");
    }

    @Override
    public void storageTemp() {
        System.out.println("Overridden: storageTemp in FrozenFoodDetails");
    }

    @Override
    public void expiryDate() {
        System.out.println("Overridden: expiryDate in FrozenFoodDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in FrozenFoodDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in FrozenFoodDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in FrozenFoodDetails");
    }
}
