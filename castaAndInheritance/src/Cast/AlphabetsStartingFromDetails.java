package Cast;

public class AlphabetsStartingFromDetails extends AlphabetsStartingFrom {
    @Override
    public void positionOfAlphabet() {
        System.out.println("Overridden: positionOfAlphabet in AlphabetsStartingFromDetails");
    }

    @Override
    public void sizeOfAlphabet() {
        System.out.println("Overridden: sizeOfAlphabet in AlphabetsStartingFromDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in AlphabetsStartingFromDetails");
    }
}
