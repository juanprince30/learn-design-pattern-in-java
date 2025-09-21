public class InfoNotification extends Notification{
    InfoNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notify(String message, String user) {
        //super.notify(message, user);
        this.sender.sendMessage(message);
    }
}
