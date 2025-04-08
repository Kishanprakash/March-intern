package Cast;

public class PulsesDetails extends Pulses {
    @Override
    public void type() {
        System.out.println("Overridden: type in PulsesDetails");
    }

    @Override
    public void proteinContent() {
        System.out.println("Overridden: proteinContent in PulsesDetails");
    }

    @Override
    public void weight() {
        System.out.println("Overridden: weight in PulsesDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in PulsesDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in PulsesDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in PulsesDetails");
    }
}
