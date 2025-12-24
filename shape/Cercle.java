package shape;

public class Cercle extends Forme {
    private static final double Pi = 3.14;
    private double rayon;
    public double calculerAire()
    {
        return (Pi * (this.rayon)*(this.rayon) );
    }
    public void afficherType()
    {
        System.out.println("C(0,0),"+this.rayon+")");
    }

}
