package Com.company;

public class main {

    public static void main(String[] args) {

        Developer developer1=new Developer("Salim");
        Developer developer2=new Developer("Mafoud");
        Developer developer3=new Developer("Emmanuel");
        Developer developer4=new Developer("Macron");
        Developer developer5=new Developer("Joe");
        developer1.afficher();
        Project projet1 = new Project("MORTAL KOMBAT");
        projet1.ajouterDeveloppeur(developer1);
        projet1.ajouterDeveloppeur(developer2);
        projet1.ajouterDeveloppeur(developer3);
        projet1.ajouterDeveloppeur(developer4);
        projet1.ajouterDeveloppeur(developer5);
        projet1.afficherEquipe();




    }

}
