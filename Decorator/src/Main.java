public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        NotifierInterface notifier=new NotifierDecorator();

        notifier= new MailNotifier(notifier);
        notifier=new SMSNotifier(notifier);
        notifier=new WhatsappNotifier(notifier);

        notifier.send("Votre Pc est en feu");
    }
}