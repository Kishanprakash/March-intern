package Cast;

public class SweetenersCast {
    public void cast(Sweeteners sweeteners) {
        System.out.println("Casting Sweeteners");
        sweeteners.color();
        sweeteners.kg();
        sweeteners.size();
        sweeteners.origin();
        sweeteners.price();
        if(sweeteners instanceof SweetenersDetails) {
            SweetenersDetails ref = (SweetenersDetails)sweeteners;
            ref.extraMethod();
        }
    }
}
