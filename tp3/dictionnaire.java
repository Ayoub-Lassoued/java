
public class dictionnaire {

    private int nb_mots;
    private Mot_dict[] Dict;
    private String nom;

    public dictionnaire(int taille, String nom) {
        this.Dict = new Mot_dict[taille];
        this.nb_mots = 0;
        this.nom = nom;
    }

    void ajouterMot(Mot_dict mot) {
        if (nb_mots >= Dict.length) {
            System.out.println("Votre dictionnaire est plein.");
            return;
        }
        Dict[nb_mots] = mot;
        nb_mots++;
        trier();
    }

    void trier() {
        for (int i = 0; i < nb_mots - 1; i++) {
            for (int j = i + 1; j < nb_mots; j++) {
                if (Dict[i].getMot().compareToIgnoreCase(Dict[j].getMot()) > 0) {
                    Mot_dict temp = Dict[i];
                    Dict[i] = Dict[j];
                    Dict[j] = temp;
                }
            }
        }
    }

    void supprimerMot(Mot_dict m) {
        for (int i = 0; i < nb_mots; i++) {
            if (Dict[i].getMot().equalsIgnoreCase(m.getMot())) {
                for (int j = i; j < nb_mots - 1; j++) {
                    Dict[j] = Dict[j + 1];
                }
                Dict[nb_mots - 1] = null;
                nb_mots--;
                System.out.println("Mot supprimé avec succès : " + m.getMot());
                return;
            }
        }
        System.out.println("Mot introuvable : " + m.getMot());
    }

    String rechercheDicho(String ch) {

        for (int i = 0; i < nb_mots; i++) {
            if (Dict[i].getMot().equalsIgnoreCase(ch)) {
                return Dict[i].getDescription();
            }
        }
        return "Mot introuvable.";
    }

    public void listerDictionnaire() {
        if (nb_mots == 0) {
            System.out.println("Le dictionnaire est vide.");
            return;
        }
        for (int i = 0; i < nb_mots; i++) {
            System.out.println((i + 1) + ") " + Dict[i]);
        }
    }

    int nombreSynonyme(Mot_dict m) {
        int s = 0;
        for (int i = 0; i < nb_mots; i++) {
            if (Dict[i].synonyme(m)) {
                s++;
            }
        }
        return s;
    }

    static class Mot_dict {

        private String mot;
        private String description;

        public Mot_dict(String mot, String description) {
            this.mot = mot;
            this.description = description;
        }

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

        public boolean synonyme(Mot_dict autre) {
            return this.description.equalsIgnoreCase(autre.description);
        }

        @Override
        public String toString() {
            return mot + " : " + description;
        }
    }

    // ====================== MAIN ======================
    public static void main(String[] args) {
        dictionnaire d = new dictionnaire(10, "MonDico");

        Mot_dict m1 = new Mot_dict("chien", "animal domestique");
        Mot_dict m2 = new Mot_dict("chat", "animal domestique");
        Mot_dict m3 = new Mot_dict("poisson", "animal aquatique");

        d.ajouterMot(m1);
        d.ajouterMot(m2);
        d.ajouterMot(m3);

        System.out.println("📘 Liste du dictionnaire :");
        d.listerDictionnaire();

        System.out.println("\n Recherche de 'chat' : " + d.rechercheDicho("chat"));

        System.out.println("\nNombre de synonymes de 'chien' : " + d.nombreSynonyme(m1));

        System.out.println("\n Suppression du mot 'chat'...");
        d.supprimerMot(m2);

        System.out.println("\n Liste après suppression :");
        d.listerDictionnaire();
    }
}
