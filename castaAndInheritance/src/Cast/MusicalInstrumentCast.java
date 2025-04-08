package Cast;

public class MusicalInstrumentCast {
    public void cast(MusicalInstrument musicalInstrument) {
        System.out.println("Casting MusicalInstrument");
        musicalInstrument.play();
        musicalInstrument.tune();
        musicalInstrument.clean();
        musicalInstrument.store();
        musicalInstrument.transport();
        if(musicalInstrument instanceof MusicalInstrumentDetails) {
            MusicalInstrumentDetails ref = (MusicalInstrumentDetails)musicalInstrument;
            ref.extraMethod();
        }
    }
}
