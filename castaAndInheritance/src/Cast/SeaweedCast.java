package Cast;

public class SeaweedCast {
    public void cast(Seaweed seaweed) {
        System.out.println("Casting Seaweed");
        seaweed.color();
        seaweed.kg();
        seaweed.size();
        seaweed.origin();
        seaweed.price();
        if(seaweed instanceof SeaweedDetails) {
            SeaweedDetails ref = (SeaweedDetails)seaweed;
            ref.extraMethod();
        }
    }
}
