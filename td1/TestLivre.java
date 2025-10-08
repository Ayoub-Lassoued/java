// Classe Livre sans public

class Livre {

    private String titre;
    private final String auteur;
    private int nbPages;

    // --- Constructeurs ---
    public Livre(String unAuteur, String unTitre, int nbPages) {
        auteur = unAuteur;
        titre = unTitre;
        this.nbPages = nbPages;
    }

    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
        this.nbPages = 0;
    }

    public Livre() {
        auteur = "Stranger";
        titre = "Stranger";
        nbPages = 0;
    }

    // --- Accesseurs ---
    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public String getTitre() {
        return titre;
    }

    // --- Modificateurs ---
    public void setTitre(String t) {
        titre = t;
    }

    public void setNbPages(int n) {
        if (n > 0) {
            nbPages = n;
        } else {
            System.out.println("Le nombre de pages doit être positif !");
        }
    }

    // --- Affichage ---
    public void afficheToi() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Titre: " + getTitre() + ", Auteur: " + getAuteur() + ", Nombre de pages: " + getNbPages();
    }
}

// Classe TestLivre public
public class TestLivre {

    public static void main(String[] args) {

        // Livre avec constructeur sans paramètre
        Livre livre1 = new Livre();
        livre1.setNbPages(300);

        // Livre avec auteur et titre
        Livre livre2 = new Livre("Victor Hugo", "Les Misérables");
        livre2.setNbPages(300);

        // Livre avec auteur, titre et nombre de pages
        Livre livre3 = new Livre("Ghassen", "Lassoued", 300);

        // Affichage avec afficheToi()
        livre1.afficheToi();
        livre2.afficheToi();
        livre3.afficheToi();

        System.out.println("/////////////////////////////////////");

        // Affichage direct via System.out.println() pour voir toString()
        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(livre3);
    }
}
