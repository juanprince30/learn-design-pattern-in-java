public class Road extends Logistic{

    @Override
    public Deliver createTransport() {
        return new Truck();
    }
}
