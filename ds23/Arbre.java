
class Arbre extends Plante {

    protected String typeF;
    final double AbsorMoy = 22;

    public Arbre(String nom, int hauteur, int age, double  prix, String typeF) {
        super(nom, hauteur, age, prix);
        this.typeF = typeF;

    }

    @Override
    public String toString() {
        return "le nom :" + nom + "\n" + "le hauteur:" + hauteur + "\n" + "le age :" + age + "\n" + "le prix" + prix + "\n" + "typeF" + typeF;
    }

    @Override
    public void description() {
        System.out.println(this.toString());

    }

    public double absorptionCO2() {
        if (hauteur > 5000) {
            return AbsorMoy + 3;
        } else {
            return AbsorMoy;
        }

    }

    public String gettypeF() {
        return this.typeF;
    }

}
