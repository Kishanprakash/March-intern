package Cast;

public class MusicalInstrumentRunner {
    public static void main(String[] args) {

        MusicalInstrument musicalInstrument1 = new MusicalInstrument();
        musicalInstrument1.play();
        musicalInstrument1.tune();
        musicalInstrument1.clean();
        musicalInstrument1.store();
        musicalInstrument1.transport();
        System.out.println("----------------------");

        MusicalInstrument musicalInstrument2 = new MusicalInstrumentDetails();
        musicalInstrument2.play();
        musicalInstrument2.tune();
        musicalInstrument2.clean();
        musicalInstrument2.store();
        musicalInstrument2.transport();
        System.out.println("----------------------");

        MusicalInstrumentDetails musicalInstrument3 = new MusicalInstrumentDetails();
        musicalInstrument3.play();
        musicalInstrument3.tune();
        musicalInstrument3.clean();
        musicalInstrument3.store();
        musicalInstrument3.transport();
        musicalInstrument3.extraMethod();
        System.out.println("----------------------");

        MusicalInstrumentCast caster = new MusicalInstrumentCast();
        caster.cast(musicalInstrument2);
    }
}
