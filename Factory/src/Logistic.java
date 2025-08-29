public abstract class Logistic {
    public abstract Deliver createTransport();

    public void planDelivery() {
        Deliver delivery = createTransport();
        delivery.Deliver();
    }
}
