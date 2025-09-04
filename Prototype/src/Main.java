public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! My programme starts here!");

        Cycle cercle=new Cycle(12.5);
        Cycle cercle_clone= (Cycle) cercle.clone();
        cercle_clone.setRayon(14);
        System.out.println( cercle.toString());
        System.out.println( cercle_clone.toString());

        Rectangle rectangle=new Rectangle(5, 12);
        Rectangle rectangle_clone= (Rectangle) rectangle.clone();
        rectangle_clone.setLargeur(18);
        rectangle_clone.setLongueur(22);
        System.out.println( rectangle.toString());
        System.out.println( rectangle_clone.toString());
    }
}