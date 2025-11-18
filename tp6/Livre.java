
public class Livre extends Article {

    protected String editeur;

    public Livre(String titre, int numero, int nbPages, String auteur, String editeur) {
        super(titre, numero, nbPages, auteur);
        this.editeur = editeur;
    }

    public String getEditeur() {
        return editeur;
    }

    @Override
    public String getType() {
        return "Livre";
    }

    @Override
    public void edition() {
        System.out.println(getType() + " → Titre : " + getTitre() + ", Numéro : " + getNumero()
                + ", Pages : " + getNbPages() + ", Auteur : " + getAuteur() + ", Éditeur : " + editeur);
    }
}
