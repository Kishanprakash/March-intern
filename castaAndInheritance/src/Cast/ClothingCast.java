package Cast;

public class ClothingCast {
    public void cast(Clothing clothing) {
        System.out.println("Casting Clothing");
        clothing.wear();
        clothing.wash();
        clothing.dry();
        clothing.iron();
        clothing.fold();
        if(clothing instanceof ClothingDetails) {
            ClothingDetails ref = (ClothingDetails)clothing;
            ref.extraMethod();
        }
    }
}
