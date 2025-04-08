package Cast;

public class JewelryRunner {
    public static void main(String[] args) {

        Jewelry jewelry1 = new Jewelry();
        jewelry1.wear();
        jewelry1.polish();
        jewelry1.clean();
        jewelry1.store();
        jewelry1.appraise();
        System.out.println("----------------------");

        Jewelry jewelry2 = new JewelryDetails();
        jewelry2.wear();
        jewelry2.polish();
        jewelry2.clean();
        jewelry2.store();
        jewelry2.appraise();
        System.out.println("----------------------");

        JewelryDetails jewelry3 = new JewelryDetails();
        jewelry3.wear();
        jewelry3.polish();
        jewelry3.clean();
        jewelry3.store();
        jewelry3.appraise();
        jewelry3.extraMethod();
        System.out.println("----------------------");

        JewelryCast caster = new JewelryCast();
        caster.cast(jewelry2);
    }
}
