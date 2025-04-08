package Cast;

public class BookRunner {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.read();
        book1.close();
        book1.bookmark();
        book1.lend();
        book1.shelve();
        System.out.println("----------------------");

        Book book2 = new BookDetails();
        book2.read();
        book2.close();
        book2.bookmark();
        book2.lend();
        book2.shelve();
        System.out.println("----------------------");

        BookDetails book3 = new BookDetails();
        book3.read();
        book3.close();
        book3.bookmark();
        book3.lend();
        book3.shelve();
        book3.extraMethod();
        System.out.println("----------------------");

        BookCast caster = new BookCast();
        caster.cast(book2);
    }
}
