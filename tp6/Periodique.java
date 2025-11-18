
public class Periodique extends Document {

    final int frequence;

    public Periodique(String titre, int numero, int nbPages, int frequence) {
        super(titre, numero, nbPages);
        this.frequence = frequence;
    }

    public int getFrequence() {
        return frequence;
    }

    @Override
    public String getType() {
        return "Périodique";
    }

    @Override
    public void edition() {
        System.out.println(getType() + " → Titre : " + getTitre() + ", Numéro : " + getNumero()
                + ", Pages : " + getNbPages() + ", Fréquence : " + frequence);
    }
}
