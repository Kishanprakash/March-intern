package Cast;

public class ClothingRunner {
    public static void main(String[] args) {

        Clothing clothing1 = new Clothing();
        clothing1.wear();
        clothing1.wash();
        clothing1.dry();
        clothing1.iron();
        clothing1.fold();
        System.out.println("----------------------");

        Clothing clothing2 = new ClothingDetails();
        clothing2.wear();
        clothing2.wash();
        clothing2.dry();
        clothing2.iron();
        clothing2.fold();
        System.out.println("----------------------");

        ClothingDetails clothing3 = new ClothingDetails();
        clothing3.wear();
        clothing3.wash();
        clothing3.dry();
        clothing3.iron();
        clothing3.fold();
        clothing3.extraMethod();
        System.out.println("----------------------");

        ClothingCast caster = new ClothingCast();
        caster.cast(clothing2);
    }
}
