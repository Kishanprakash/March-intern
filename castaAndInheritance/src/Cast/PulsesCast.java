package Cast;

public class PulsesCast {
    public void cast(Pulses pulses) {
        System.out.println("Casting Pulses");
        pulses.type();
        pulses.proteinContent();
        pulses.weight();
        pulses.origin();
        pulses.price();
        if(pulses instanceof PulsesDetails) {
            PulsesDetails ref = (PulsesDetails)pulses;
            ref.extraMethod();
        }
    }
}
