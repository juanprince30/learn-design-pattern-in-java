public class Air extends Logistic{
    @Override
    public Deliver createTransport() {
        return new AirPlane();
    }
}
