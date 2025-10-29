
public class Fleur extends Plante {

    protected String coleur;
    protected int moisF;

    public Fleur(String nom, int hauteur, int age, double prix, String coleur, int moisF) {
        super(nom, hauteur, age, prix);
        this.coleur = coleur;
        this.moisF = moisF;

    }

    @Override
    public String toString() {
        return "le nom :" + nom + "\n" + "le hauteur:" + hauteur + "\n" + "le age :" + age + "\n" + "le prix" + prix + "\n" + coleur + "\n" + "le moisF:" + moisF;
    }

    @Override
    public void description() {
        System.out.println(this.toString());
        Fleurire();

    }

    public void Fleurire() {
        if (moisF == 4 || moisF == 5 || moisF == 6) {
            System.out.println("oui le  fleur est en fleur ");
        } else {
            System.out.println("le fleur est n'est pas en fleur ");
        }

    }

    public String getColeur() {
        return this.coleur;
    }

}
