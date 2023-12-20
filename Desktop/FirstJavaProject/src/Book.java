public class Book {
    private String title;
    private Author author;
    private int ISBN;
    private int price;

    Book(String title, Author author, int ISBN, int price){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price= price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(String Author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
