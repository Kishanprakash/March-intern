package Cast;

public class CosmeticsRunner {
    public static void main(String[] args) {

        Cosmetics cosmetics1 = new Cosmetics();
        cosmetics1.apply();
        cosmetics1.remove();
        cosmetics1.purchase();
        cosmetics1.store();
        cosmetics1.checkExpiry();
        System.out.println("----------------------");

        Cosmetics cosmetics2 = new CosmeticsDetails();
        cosmetics2.apply();
        cosmetics2.remove();
        cosmetics2.purchase();
        cosmetics2.store();
        cosmetics2.checkExpiry();
        System.out.println("----------------------");

        CosmeticsDetails cosmetics3 = new CosmeticsDetails();
        cosmetics3.apply();
        cosmetics3.remove();
        cosmetics3.purchase();
        cosmetics3.store();
        cosmetics3.checkExpiry();
        cosmetics3.extraMethod();
        System.out.println("----------------------");

        CosmeticsCast caster = new CosmeticsCast();
        caster.cast(cosmetics2);
    }
}
