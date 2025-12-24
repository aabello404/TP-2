package Com.garage;


public class Voiture extends Vehicule {

    private int nbrdeporte;
    public Voiture(String marq, String model, int year, int doors )
    {
        super(marq,model,year);
        this.nbrdeporte=doors;
    }
    @Override public void afficherDetails()
    {
        super.afficherDetails();
        System.out.println("nombre de portes: " +this.nbrdeporte);
    }

}

