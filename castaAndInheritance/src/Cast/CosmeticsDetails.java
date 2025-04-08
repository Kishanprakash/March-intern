package Cast;

public class CosmeticsDetails extends Cosmetics {
    @Override
    public void apply() {
        System.out.println("Overridden: apply in CosmeticsDetails");
    }

    @Override
    public void remove() {
        System.out.println("Overridden: remove in CosmeticsDetails");
    }

    @Override
    public void purchase() {
        System.out.println("Overridden: purchase in CosmeticsDetails");
    }

    @Override
    public void store() {
        System.out.println("Overridden: store in CosmeticsDetails");
    }

    @Override
    public void checkExpiry() {
        System.out.println("Overridden: checkExpiry in CosmeticsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CosmeticsDetails");
    }
}
