package Cast;

public class FootwearRunner {
    public static void main(String[] args) {

        Footwear footwear1 = new Footwear();
        footwear1.wear();
        footwear1.clean();
        footwear1.polish();
        footwear1.lace();
        footwear1.store();
        System.out.println("----------------------");

        Footwear footwear2 = new FootwearDetails();
        footwear2.wear();
        footwear2.clean();
        footwear2.polish();
        footwear2.lace();
        footwear2.store();
        System.out.println("----------------------");

        FootwearDetails footwear3 = new FootwearDetails();
        footwear3.wear();
        footwear3.clean();
        footwear3.polish();
        footwear3.lace();
        footwear3.store();
        footwear3.extraMethod();
        System.out.println("----------------------");

        FootwearCast caster = new FootwearCast();
        caster.cast(footwear2);
    }
}
