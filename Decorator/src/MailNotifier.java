public class MailNotifier extends Decorator{
        public MailNotifier(NotifierInterface ni){
            super(ni);
        }

        @Override
        public void send(String message) {
            super.send(message);
            System.out.println("Envoie de Message pas Mail "+message);
        }

}
