package Cast;

public class ClothingDetails extends Clothing {
    @Override
    public void wear() {
        System.out.println("Overridden: wear in ClothingDetails");
    }

    @Override
    public void wash() {
        System.out.println("Overridden: wash in ClothingDetails");
    }

    @Override
    public void dry() {
        System.out.println("Overridden: dry in ClothingDetails");
    }

    @Override
    public void iron() {
        System.out.println("Overridden: iron in ClothingDetails");
    }

    @Override
    public void fold() {
        System.out.println("Overridden: fold in ClothingDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ClothingDetails");
    }
}
