public class WhatsappNotifier extends Decorator{
        public WhatsappNotifier(NotifierInterface ni){
            super(ni);
        }

        @Override
        public void send(String message) {
            super.send(message);
            System.out.println("Envoie de Message pas Whatsapp "+message);
        }

}
