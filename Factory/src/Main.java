
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello programme start here!");
        Logistic roadLogistic=new Road();
        roadLogistic.planDelivery();

        Logistic seaLogistic=new Sea();
        seaLogistic.planDelivery();

        Logistic airLogistic=new Air();
        airLogistic.planDelivery();



    }
}