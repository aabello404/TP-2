package Com.company;

public class Developer {
    private String nom;
    public Developer(String name)
    {
        this.nom=name;
    }
    public String getNom()
    {
        return this.nom;
    }
    public void setNom(String name)
    {
        if(name.equals(""))
        {
            System.out.println("Invalid name");
            return;
        }
        this.nom=name;
    }
    public void afficher()
    {
        System.out.println("Mr/Mrs "+ this.nom);
    }
}
