package Start.Day6.Exercise1;

public class Book {
    private long ISBN;
    private String title;
    private String author;

    public Book(long ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public long getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
