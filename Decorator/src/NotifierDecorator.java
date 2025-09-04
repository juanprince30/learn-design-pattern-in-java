public class NotifierDecorator implements NotifierInterface{

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
