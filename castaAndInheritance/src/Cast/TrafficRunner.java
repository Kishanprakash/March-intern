package Cast;

public class TrafficRunner {
    public static void main(String[] args) {

        Traffic traffic1 = new Traffic();
        traffic1.color();
        traffic1.kg();
        traffic1.size();
        traffic1.origin();
        traffic1.price();
        System.out.println("----------------------");

        Traffic traffic2 = new TrafficDetails();
        traffic2.color();
        traffic2.kg();
        traffic2.size();
        traffic2.origin();
        traffic2.price();
        System.out.println("----------------------");

        TrafficDetails traffic3 = new TrafficDetails();
        traffic3.color();
        traffic3.kg();
        traffic3.size();
        traffic3.origin();
        traffic3.price();
        traffic3.extraMethod();
        System.out.println("----------------------");

        TrafficCast caster = new TrafficCast();
        caster.cast(traffic2);
    }
}
