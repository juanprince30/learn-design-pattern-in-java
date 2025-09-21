public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! My programme Starts here");

        Light light =new Light();
        LightOnCommande lightOn= new LightOnCommande(light);
        LightOffCommand lightOff= new LightOffCommand(light);

        RemoteControl control= new RemoteControl();
        control.setCommand(lightOn);
        control.pressButton();

        control.setCommand(lightOff);
        control.pressButton();
    }
}