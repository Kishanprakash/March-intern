package Cast;

public class PulsesRunner {
    public static void main(String[] args) {

        Pulses pulses1 = new Pulses();
        pulses1.type();
        pulses1.proteinContent();
        pulses1.weight();
        pulses1.origin();
        pulses1.price();
        System.out.println("----------------------");

        Pulses pulses2 = new PulsesDetails();
        pulses2.type();
        pulses2.proteinContent();
        pulses2.weight();
        pulses2.origin();
        pulses2.price();
        System.out.println("----------------------");

        PulsesDetails pulses3 = new PulsesDetails();
        pulses3.type();
        pulses3.proteinContent();
        pulses3.weight();
        pulses3.origin();
        pulses3.price();
        pulses3.extraMethod();
        System.out.println("----------------------");

        PulsesCast caster = new PulsesCast();
        caster.cast(pulses2);
    }
}
