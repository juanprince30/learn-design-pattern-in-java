import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject{
    private List<Observer> observerList= new ArrayList<>();
    private String weather;

    @Override
    public void unsubscribe(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    @Override
    public void subscribe(Observer observer) {
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    @Override
    public void notify(String message) {
        for(Observer observer: observerList){
            observer.update(message);
        }
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notify(weather);
    }
}
