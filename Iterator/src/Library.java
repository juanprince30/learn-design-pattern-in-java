import java.util.ArrayList;
import java.util.List;

public class Library implements Collection {
    public List<Book> books =new ArrayList<>();

    public void addBooK(Book book){
        this.books.add(book);
    }

    @Override
    public Interator iterator() {
        return new LibraryIterator(books);
    }
}
