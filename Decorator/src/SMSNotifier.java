public class SMSNotifier extends Decorator{
    public SMSNotifier(NotifierInterface ni){
        super(ni);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Envoie de Message pas SMS "+message);
    }
}
