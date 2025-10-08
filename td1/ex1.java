
class Livre {

    // --- Attributs privés ---
    private final String titre, auteur;
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

    public String getTitre() {
        return titre;
    }

    // --- Modificateur ---
    public void setNbPages(int n) {
        nbPages = n;
    }

    public int getNbPages() {
        return nbPages;
    }

    // --- Méthode main ---
    public static void main(String[] args) {
        Livre l = new Livre("Victor Hugo", "Les Misérables", 20);

        Livre l1 = new Livre("ghassen", "lassoued", 28);

        System.out.println("Titre : " + l.getTitre());
        System.out.println("Auteur : " + l.getAuteur());
        System.out.println("Nombre de pages : " + l.getNbPages());
        System.out.println("///////////////////////////////////////////");
        System.out.println("Titre : " + l1.getTitre());
        System.out.println("Auteur : " + l1.getAuteur());
        System.out.println("Nombre de pages : " + l1.getNbPages());
    }
}
