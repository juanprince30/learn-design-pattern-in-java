public class Cycle implements Prototype {
    @Override
    public Prototype clone() {
        return new Cycle(this.rayon);
    }

    private double rayon;

    public Cycle(double r){
        rayon=r;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Rayon du Cercle est : " + this.rayon;
    }
}
