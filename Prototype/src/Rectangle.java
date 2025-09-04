public class Rectangle implements Prototype{
    private double longueur;
    private double largeur;

    public Rectangle(double largeur, double longueur){
        this.largeur=largeur;
        this.longueur=longueur;
    }

    @Override
    public Prototype clone() {
        return new Rectangle(this.largeur, this.longueur);
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        return "Longueur et la Largeur du rectangle sont respectivement: "+this.longueur+" et "+this.largeur;
    }
}
