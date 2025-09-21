public class EmergencyNotification extends Notification{
    EmergencyNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notify(String message, String user) {
        //super.notify(message, user);
        this.sender.sendMessage(message);
    }
}
