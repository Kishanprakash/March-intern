package Cast;

public class BookCast {
    public void cast(Book book) {
        System.out.println("Casting Book");
        book.read();
        book.close();
        book.bookmark();
        book.lend();
        book.shelve();
        if(book instanceof BookDetails) {
            BookDetails ref = (BookDetails)book;
            ref.extraMethod();
        }
    }
}
