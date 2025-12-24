package Com.garage;

public class Vehicule {
    protected String marque;
    protected String modele;
    protected int annee;
    public Vehicule(String mark, String Model, int year)
    {
        this.marque=mark;
        this.modele=Model;
        this.annee=year;
    }
    public void afficherDetails()
    {
        System.out.print("Marque : "+this.marque+", Modèle :" +this.modele+", Annee: "+ this.annee+", ");
    }
}
