package shape;


public class main {

    public static void main(String[] args) {


        Forme[] formes = new Forme[2];
        formes[0] = new Cercle(5);
        formes[1] = new Rectangle(4, 6);

        for (Forme f : formes) {
            f.afficherType();
            System.out.println("Aire = " + f.calculerAire());


            if (f instanceof Cercle) {
                Cercle c = (Cercle) f;
                System.out.println("Rayon = " + c.getRayon());
            } else if (f instanceof Rectangle) {
                Rectangle r = (Rectangle) f;
                System.out.println("Longueur = " + r.getLongueur()
                        + ", Largeur = " + r.getLargeur());
            }

            System.out.println("------------------");
        }

        testerCast();
    }


    public static void testerCast() {

        Forme f = new Cercle(10);

        if (f instanceof Cercle) {
            Cercle c = (Cercle) f;
            System.out.println("Downcast Cercle réussi : rayon = " + c.getRayon());
        }


        if (f instanceof Rectangle) {
            Rectangle r = (Rectangle) f;
        } else {
            System.out.println("Downcast Cercle → Rectangle impossible ");
        }
    }
}
