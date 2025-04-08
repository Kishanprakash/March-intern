package Cast;

public class MusicalInstrumentDetails extends MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Overridden: play in MusicalInstrumentDetails");
    }

    @Override
    public void tune() {
        System.out.println("Overridden: tune in MusicalInstrumentDetails");
    }

    @Override
    public void clean() {
        System.out.println("Overridden: clean in MusicalInstrumentDetails");
    }

    @Override
    public void store() {
        System.out.println("Overridden: store in MusicalInstrumentDetails");
    }

    @Override
    public void transport() {
        System.out.println("Overridden: transport in MusicalInstrumentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MusicalInstrumentDetails");
    }
}
