public class DataBaseConnexionSingleton {
    private static DataBaseConnexionSingleton instance;

    private DataBaseConnexionSingleton()
    {

    }

    public static DataBaseConnexionSingleton getInstance(){
        if(instance==null){
            System.out.println("creating a new instance ");
            instance=new DataBaseConnexionSingleton();
        }
        System.out.println("Returning instance already created");
        return instance;
    }
}
