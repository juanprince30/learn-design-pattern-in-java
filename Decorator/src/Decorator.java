abstract public class Decorator implements NotifierInterface{
    protected NotifierInterface ni;

    public Decorator(NotifierInterface ni){
        this.ni=ni;
    }

    public void send(String message){
        this.ni.send(message);
    }
}
