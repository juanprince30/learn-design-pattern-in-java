public class WeatherWidget implements Observer{
    private String name;

    @Override
    public void update(String message) {
        System.out.println("WeatherWidget " + name + " received weather update: " + message);
    }

    public WeatherWidget(String name){
        this.name=name;
    }
}
