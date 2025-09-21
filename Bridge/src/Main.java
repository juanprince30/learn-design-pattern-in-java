public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world, My programme Starts here!");
        EmergencyNotification emergencySMS= new EmergencyNotification(new SMSSender());
        emergencySMS.notify("Votre maisson est en feu", "+2266666666");

        EmergencyNotification emergencyEmail= new EmergencyNotification(new EmailSender());
        emergencySMS.notify("Votre maisson est en feu", "votre_mail@gmail.com");
    }
}