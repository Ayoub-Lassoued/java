
public class Document {

    protected String titre;
    protected int numero;
    protected int nbPages;

    public Document(String titre, int numero, int nbPages) {
        this.titre = titre;
        this.numero = numero;
        this.nbPages = nbPages;
    }

    public String getTitre() {
        return titre;
    }

    public int getNumero() {
        return numero;
    }

    public int getNbPages() {
        return nbPages;
    }

    public String getType() {
        return "Document";
    }

    public void edition() {
        System.out.println("type " + getType() + "  Titre : " + titre + ", Numéro : " + numero + ", Pages : " + nbPages);
    }
}
