public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Here my programme starts");
        Library library=new Library();
        library.addBooK(new Book("Moliere","Candide"));
        library.addBooK(new Book("Shakespear","Book"));
        library.addBooK(new Book("Moliere","Candide"));
        library.addBooK(new Book("Shakespear","Book"));
        library.addBooK(new Book("Moliere","Candide"));
        library.addBooK(new Book("Shakespear","Book"));
        library.addBooK(new Book("Moliere","Candide"));
        library.addBooK(new Book("Shakespear","Book"));
        library.addBooK(new Book("Moliere","Candide"));
        library.addBooK(new Book("Shakespear","Book"));


        Interator iterator=library.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}