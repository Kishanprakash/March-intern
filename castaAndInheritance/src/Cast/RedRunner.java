package Cast;

public class RedRunner {
    public static void main(String[] args) {

        Red red1 = new Red();
        red1.color();
        red1.kg();
        red1.size();
        red1.origin();
        red1.price();
        System.out.println("----------------------");

        Red red2 = new RedDetails();
        red2.color();
        red2.kg();
        red2.size();
        red2.origin();
        red2.price();
        System.out.println("----------------------");

        RedDetails red3 = new RedDetails();
        red3.color();
        red3.kg();
        red3.size();
        red3.origin();
        red3.price();
        red3.extraMethod();
        System.out.println("----------------------");

        RedCast caster = new RedCast();
        caster.cast(red2);
    }
}
