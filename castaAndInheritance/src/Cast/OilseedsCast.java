package Cast;

public class OilseedsCast {
    public void cast(Oilseeds oilseeds) {
        System.out.println("Casting Oilseeds");
        oilseeds.color();
        oilseeds.kg();
        oilseeds.size();
        oilseeds.origin();
        oilseeds.price();
        if(oilseeds instanceof OilseedsDetails) {
            OilseedsDetails ref = (OilseedsDetails)oilseeds;
            ref.extraMethod();
        }
    }
}
