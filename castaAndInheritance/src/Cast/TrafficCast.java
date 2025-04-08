package Cast;

public class TrafficCast {
    public void cast(Traffic traffic) {
        System.out.println("Casting Traffic");
        traffic.color();
        traffic.kg();
        traffic.size();
        traffic.origin();
        traffic.price();
        if(traffic instanceof TrafficDetails) {
            TrafficDetails ref = (TrafficDetails)traffic;
            ref.extraMethod();
        }
    }
}
