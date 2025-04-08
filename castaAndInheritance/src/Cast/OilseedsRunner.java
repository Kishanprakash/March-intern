package Cast;

public class OilseedsRunner {
    public static void main(String[] args) {

        Oilseeds oilseeds1 = new Oilseeds();
        oilseeds1.color();
        oilseeds1.kg();
        oilseeds1.size();
        oilseeds1.origin();
        oilseeds1.price();
        System.out.println("----------------------");

        Oilseeds oilseeds2 = new OilseedsDetails();
        oilseeds2.color();
        oilseeds2.kg();
        oilseeds2.size();
        oilseeds2.origin();
        oilseeds2.price();
        System.out.println("----------------------");

        OilseedsDetails oilseeds3 = new OilseedsDetails();
        oilseeds3.color();
        oilseeds3.kg();
        oilseeds3.size();
        oilseeds3.origin();
        oilseeds3.price();
        oilseeds3.extraMethod();
        System.out.println("----------------------");

        OilseedsCast caster = new OilseedsCast();
        caster.cast(oilseeds2);
    }
}
