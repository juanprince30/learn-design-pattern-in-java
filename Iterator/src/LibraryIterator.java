import java.util.List;

public class LibraryIterator implements Interator{
    private int index=0;
    private List<Book> books;

     public LibraryIterator(List<Book> books){
         this.books=books;
     }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Object next() {
        return books.get(index++);
    }
}
