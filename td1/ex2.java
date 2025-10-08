
class Livre {

    // --- Attributs privés ---
    private String titre;
    private final String auteur;
    private int nbPages;

    // --- Constructeur ---
    public Livre(String unAuteur, String unTitre, int nbPages) {
        auteur = unAuteur;
        titre = unTitre;
        this.nbPages = nbPages;
    }

    // --- Accesseur ---
    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public String gettitre() {
        return titre;
    }

    public void settitre(String t) {
        titre = t;

    }

    // --- Modificateur ---
    public void setNbPages(int n) {
        if (n > 0) {
            nbPages = n;
        } else {
            System.out.println("le nombre n doit etre positive ");
        }

    }

    // --- Méthode main ---
    public static void main(String[] args) {
        Livre l = new Livre("Victor Hugo", "Les Misérables", 28);
        l.getNbPages();
        Livre l1 = new Livre("ghassen", "Les abessi", 200);
        l1.getNbPages();

        System.out.println("Titre : " + l.titre);
        System.out.println("Auteur : " + l.gettitre());
        System.out.println("Nombre de pages : " + l.getNbPages());
        System.out.println("Titre : " + l1.auteur);
        System.out.println("Auteur : " + l1.getAuteur());
        System.out.println("Nombre de pages : " + l1.getNbPages());
    }
}
