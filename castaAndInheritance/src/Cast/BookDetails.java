package Cast;

public class BookDetails extends Book {
    @Override
    public void read() {
        System.out.println("Overridden: read in BookDetails");
    }

    @Override
    public void close() {
        System.out.println("Overridden: close in BookDetails");
    }

    @Override
    public void bookmark() {
        System.out.println("Overridden: bookmark in BookDetails");
    }

    @Override
    public void lend() {
        System.out.println("Overridden: lend in BookDetails");
    }

    @Override
    public void shelve() {
        System.out.println("Overridden: shelve in BookDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BookDetails");
    }
}
