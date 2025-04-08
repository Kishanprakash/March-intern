package Cast;

public class TubersRunner {
    public static void main(String[] args) {

        Tubers tubers1 = new Tubers();
        tubers1.color();
        tubers1.kg();
        tubers1.size();
        tubers1.origin();
        tubers1.price();
        System.out.println("----------------------");

        Tubers tubers2 = new TubersDetails();
        tubers2.color();
        tubers2.kg();
        tubers2.size();
        tubers2.origin();
        tubers2.price();
        System.out.println("----------------------");

        TubersDetails tubers3 = new TubersDetails();
        tubers3.color();
        tubers3.kg();
        tubers3.size();
        tubers3.origin();
        tubers3.price();
        tubers3.extraMethod();
        System.out.println("----------------------");

        TubersCast caster = new TubersCast();
        caster.cast(tubers2);
    }
}
