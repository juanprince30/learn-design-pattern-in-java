public class Book {
    private String Author;
    private String title;

    public Book(String author, String title){
        this.Author=author;
        this.title=title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
