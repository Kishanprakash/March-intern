package Cast;

public class CosmeticsCast {
    public void cast(Cosmetics cosmetics) {
        System.out.println("Casting Cosmetics");
        cosmetics.apply();
        cosmetics.remove();
        cosmetics.purchase();
        cosmetics.store();
        cosmetics.checkExpiry();
        if(cosmetics instanceof CosmeticsDetails) {
            CosmeticsDetails ref = (CosmeticsDetails)cosmetics;
            ref.extraMethod();
        }
    }
}
