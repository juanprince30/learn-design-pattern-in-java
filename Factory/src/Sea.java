public class Sea extends Logistic{
    @Override
    public Deliver createTransport() {
        return new Ship();
    }
}
