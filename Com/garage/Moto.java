package Com.garage;

public class Moto extends Vehicule {
    private int cylinder;
    public Moto(String mrq, String mdl , int year , int cyl)
    {
        super(mrq,mdl,year);
        this.cylinder=cyl;
    }
    @Override
    public void afficherDetails()
    {
        super.afficherDetails();
        System.out.println("Cylinder: "+this.cylinder);
    }

}
