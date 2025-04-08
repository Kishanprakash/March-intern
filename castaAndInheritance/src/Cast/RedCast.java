package Cast;

public class RedCast {
    public void cast(Red red) {
        System.out.println("Casting Red");
        red.color();
        red.kg();
        red.size();
        red.origin();
        red.price();
        if(red instanceof RedDetails) {
            RedDetails ref = (RedDetails)red;
            ref.extraMethod();
        }
    }
}
