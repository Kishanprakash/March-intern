package Cast;

public class AlphabetsStartingFromRunner {
    public static void main(String[] args) {

        AlphabetsStartingFrom alphabetsStartingFrom1 = new AlphabetsStartingFrom();
        alphabetsStartingFrom1.positionOfAlphabet();
        alphabetsStartingFrom1.sizeOfAlphabet();
        System.out.println("----------------------");

        AlphabetsStartingFrom alphabetsStartingFrom2 = new AlphabetsStartingFromDetails();
        alphabetsStartingFrom2.positionOfAlphabet();
        alphabetsStartingFrom2.sizeOfAlphabet();
        System.out.println("----------------------");

        AlphabetsStartingFromDetails alphabetsStartingFrom3 = new AlphabetsStartingFromDetails();
        alphabetsStartingFrom3.positionOfAlphabet();
        alphabetsStartingFrom3.sizeOfAlphabet();
        alphabetsStartingFrom3.extraMethod();
        System.out.println("----------------------");

        AlphabetsStartingFromCast caster = new AlphabetsStartingFromCast();
        caster.cast(alphabetsStartingFrom2);
    }
}
