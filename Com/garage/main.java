package Com.garage;

public class main {

    public static void main(String[] args) {
        Voiture voiture1=new Voiture("Mercedes", "E63",2026,4);
        Moto moto1= new Moto("BMW","Bike",2025,2);
        voiture1.afficherDetails();
        moto1.afficherDetails();
        Vehicule ref1=voiture1;
        ref1.afficherDetails();
        Vehicule ref2 = moto1;
        ref2.afficherDetails();

    }

}
