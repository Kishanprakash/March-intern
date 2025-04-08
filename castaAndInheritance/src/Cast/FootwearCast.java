package Cast;

public class FootwearCast {
    public void cast(Footwear footwear) {
        System.out.println("Casting Footwear");
        footwear.wear();
        footwear.clean();
        footwear.polish();
        footwear.lace();
        footwear.store();
        if(footwear instanceof FootwearDetails) {
            FootwearDetails ref = (FootwearDetails)footwear;
            ref.extraMethod();
        }
    }
}
