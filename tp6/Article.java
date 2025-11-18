
public class Article extends Document {

    protected String auteur;

    public Article(String titre, int numero, int nbPages, String auteur) {
        super(titre, numero, nbPages);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    @Override
    public String getType() {
        return "Article";
    }

    @Override
    public void edition() {
        System.out.println(getType() + " → Titre : " + getTitre() + ", Numéro : " + getNumero()
                + ", Pages : " + getNbPages() + ", Auteur : " + auteur);
    }
}
