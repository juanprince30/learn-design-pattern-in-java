public interface Subject {
    void unsubscribe(Observer observer);
    void subscribe(Observer observer);
    void notify (String message);
}


