package Cast;

public class AlphabetsStartingFromCast {
    public void cast(AlphabetsStartingFrom alphabetsStartingFrom) {
        System.out.println("Casting AlphabetsStartingFrom");
        alphabetsStartingFrom.positionOfAlphabet();
        alphabetsStartingFrom.sizeOfAlphabet();
        if(alphabetsStartingFrom instanceof AlphabetsStartingFromDetails) {
            AlphabetsStartingFromDetails ref = (AlphabetsStartingFromDetails)alphabetsStartingFrom;
            ref.extraMethod();
        }
    }
}
