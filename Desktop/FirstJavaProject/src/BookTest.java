public class BookTest {
    public static void main(String[] args) {
        Author author = new Author ("Poco",65,'f',"PhD");
        Book book1 = new Book("First Day at PNT",author,2542, 64 );

        System.out.println(book1.getAuthor().getName());
        System.out.println(book1.getTitle());

    }
}
