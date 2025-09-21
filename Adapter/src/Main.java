public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world, Our Programme Start here!");
        FileFormatAdatper adp= new FileFormatAdatper();
        String filename = "path/to/report.txt";
        String output_filename= "path/to/output.pdf";
        adp.covert(filename, output_filename, "txt", "pdf");
    }
}