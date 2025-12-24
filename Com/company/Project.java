package Com.company;

public class Project {
    private String nomProject;
    private Developer[] devs;
    private int nbrDevs;
    public Project(String projectname)
    {
        this.nomProject=projectname;
        this.devs=new Developer[5];
        this.nbrDevs=0;
    }
    public void ajouterDeveloppeur(Developer dev)
    {
        if(this.nbrDevs<5)
        {
            this.devs[this.nbrDevs++]=dev;
            return;
        }
        System.out.println("Projet attient max nombre de developpeurs");
    }
    public void afficherEquipe()
    {
        System.out.println("Nom du projet: "+this.nomProject );
        System.out.println("Developper travillant sur le proget");
        for(int i=0; i<this.nbrDevs;i++)
        {
            this.devs[i].afficher();

        }
    }
}
