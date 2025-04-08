package Cast;

public class TubersCast {
    public void cast(Tubers tubers) {
        System.out.println("Casting Tubers");
        tubers.color();
        tubers.kg();
        tubers.size();
        tubers.origin();
        tubers.price();
        if(tubers instanceof TubersDetails) {
            TubersDetails ref = (TubersDetails)tubers;
            ref.extraMethod();
        }
    }
}
