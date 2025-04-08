package Cast;

public class JewelryCast {
    public void cast(Jewelry jewelry) {
        System.out.println("Casting Jewelry");
        jewelry.wear();
        jewelry.polish();
        jewelry.clean();
        jewelry.store();
        jewelry.appraise();
        if(jewelry instanceof JewelryDetails) {
            JewelryDetails ref = (JewelryDetails)jewelry;
            ref.extraMethod();
        }
    }
}
