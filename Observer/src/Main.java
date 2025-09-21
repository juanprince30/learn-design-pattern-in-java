public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! My programme Starts here");

        WeatherSubject weatherSubject=new WeatherSubject();
        WeatherWidget weatherWidget=new WeatherWidget("WeatherWidget");
        WeatherApp weatherApp=new WeatherApp("WeatherApp");

        weatherSubject.subscribe(weatherWidget);
        weatherSubject.subscribe(weatherApp);

        weatherSubject.setWeather("25 °C");
        weatherSubject.setWeather("38 °C");

        weatherSubject.unsubscribe(weatherApp);

        weatherSubject.setWeather("29 °C");


    }
}