public class WeatherApp implements Observer{
    private String name;

    @Override
    public void update(String message) {
        System.out.println("WeatherApp " + name + " received weather update: " + message);
    }

    public WeatherApp(String name){
        this.name=name;
    }
}
