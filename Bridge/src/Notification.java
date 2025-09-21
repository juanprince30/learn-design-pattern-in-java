abstract class Notification {
    protected MessageSender sender;
    Notification(MessageSender sender){
        this.sender=sender;
    }

    public void notify(String message, String user) {

    }
}
