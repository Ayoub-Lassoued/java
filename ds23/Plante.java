
class Plante {

    public String nom;
    public int hauteur;
    public int age;
    public double prix;

    public Plante(String nom, int hauteur, int age, double prix) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.age = age;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "le nom :" + nom + "\n" + "le hauteur:" + hauteur + "\n" + "le age :" + age + "\n" + "le prix" + prix;
    }

    public void description() {
        System.out.println(this.toString());
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String ch) {
        this.nom = ch;
    }

}
