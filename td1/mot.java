
class mot {

    private String mot;
    private String description;

    public String getMot() {
        return mot;
    }

    public String getDescription() {
        return description;
    }

    public void setMot(String ch) {
        mot = ch;
    }

    public void setDescription(String ch) {
        description = ch;
    }

}

class dict {

    private int nbmot;
    private String nom;
    private String[] tab;

    public dict(String nom) {
        this.nom = nom;
        this.nbmot = 0;
        this.tab = new String[100];
    }

    public dict(String nom, int n) {
        this.nom = nom;
        this.nbmot = 0;
        this.tab = new String[n];
    }

    public void ajout(String mot) {

    }

}
