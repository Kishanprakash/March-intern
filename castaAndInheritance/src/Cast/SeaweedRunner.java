package Cast;

public class SeaweedRunner {
    public static void main(String[] args) {

        Seaweed seaweed1 = new Seaweed();
        seaweed1.color();
        seaweed1.kg();
        seaweed1.size();
        seaweed1.origin();
        seaweed1.price();
        System.out.println("----------------------");

        Seaweed seaweed2 = new SeaweedDetails();
        seaweed2.color();
        seaweed2.kg();
        seaweed2.size();
        seaweed2.origin();
        seaweed2.price();
        System.out.println("----------------------");

        SeaweedDetails seaweed3 = new SeaweedDetails();
        seaweed3.color();
        seaweed3.kg();
        seaweed3.size();
        seaweed3.origin();
        seaweed3.price();
        seaweed3.extraMethod();
        System.out.println("----------------------");

        SeaweedCast caster = new SeaweedCast();
        caster.cast(seaweed2);
    }
}
