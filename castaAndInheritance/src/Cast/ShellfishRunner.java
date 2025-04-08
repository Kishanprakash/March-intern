package Cast;

public class ShellfishRunner {
    public static void main(String[] args) {

        Shellfish shellfish1 = new Shellfish();
        shellfish1.color();
        shellfish1.kg();
        shellfish1.size();
        shellfish1.origin();
        shellfish1.price();
        System.out.println("----------------------");

        Shellfish shellfish2 = new ShellfishDetails();
        shellfish2.color();
        shellfish2.kg();
        shellfish2.size();
        shellfish2.origin();
        shellfish2.price();
        System.out.println("----------------------");

        ShellfishDetails shellfish3 = new ShellfishDetails();
        shellfish3.color();
        shellfish3.kg();
        shellfish3.size();
        shellfish3.origin();
        shellfish3.price();
        shellfish3.extraMethod();
        System.out.println("----------------------");

        ShellfishCast caster = new ShellfishCast();
        caster.cast(shellfish2);
    }
}
