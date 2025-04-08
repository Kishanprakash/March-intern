package Cast;

public class ShellfishCast {
    public void cast(Shellfish shellfish) {
        System.out.println("Casting Shellfish");
        shellfish.color();
        shellfish.kg();
        shellfish.size();
        shellfish.origin();
        shellfish.price();
        if(shellfish instanceof ShellfishDetails) {
            ShellfishDetails ref = (ShellfishDetails)shellfish;
            ref.extraMethod();
        }
    }
}
