public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world, my proramme stat here!");
        DataBaseConnexionSingleton connect= DataBaseConnexionSingleton.getInstance();

        System.out.println("ask connexion again to see what will happen");
        DataBaseConnexionSingleton connect2= DataBaseConnexionSingleton.getInstance();

        System.out.println("ask connexion again to be totally sure lol");
        DataBaseConnexionSingleton connect3= DataBaseConnexionSingleton.getInstance();
    }
}