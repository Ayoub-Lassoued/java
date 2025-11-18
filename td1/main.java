
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
            System.out.println("Votre tableau est plein.");
            return;
        } else {
            Dict[nb_mots] = mot;
            nb_mots++;
            trier();
        }
    }

    void trier() {
        //Arrays.sort(Dict, 0, nb_mots, (a, b) -> a.getMot().compareToIgnoreCase(b.getMot()));
        for (int i = 0; i < nb_mots - 1; i++) {
            for (int j = i + 1; j < nb_mots; j++) {
                if (Dict[i].getMot().compareTo(Dict[j].getMot()) > 0) {
                    Mot_dict temp = Dict[i];
                    Dict[i] = Dict[j];
                    Dict[j] = temp;
                }
            }
        }
    }

    void Supprimer_Mot(Mot_dict m) {
        for (int i = 0; i < nb_mots; i++) {
            if (Dict[i].getMot().compareTo(m.getMot()) == 0) {
                for (int j = i; j < nb_mots - 1; j++) {
                    Dict[j] = Dict[j + 1];
                }
            }
            Dict[nb_mots - 1] = null;
            nb_mots--;
            break;
        }
    }

    String Recherche_dicho(String ch) {
        for (int i = 0; i < nb_mots; i++) {
            if (Dict[i].getMot().compareTo(ch) == 0) {
                return Dict[i].getDef();
            }
        }
        return "Mot n'est pas trouvable";
    }

    public void listerDictionnaire() {
        for (int i = 0; i < nb_mots; i++) {
            System.out.println(i + ")" + Dict[i].toString());
        }
    }

    int Nombre_synonyme(Mot_dict m) {
        int s = 0;
        for (int i = 0; i < nb_mots; i++) {
            if (Dict[i].synonymes(m)) {
                s++;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Mot_dict m1 = new Mot_dict();
        m1.setMot("chien");
        m1.setDef("animal domestique");

        Mot_dict m2 = new Mot_dict();
        m2.setMot("chat");
        m2.setDef("animal domestique");

        Mot_dict m3 = new Mot_dict();
        m3.setMot("poisson");
        m3.setDef("animal aquatique");

        dictionnaire d = new dictionnaire(10, "MonDico");
        d.ajouterMot(m1);
        d.ajouterMot(m2);
        d.ajouterMot(m3);

        d.listerDictionnaire();

        System.out.println(d.Recherche_dicho("chat"));

        System.out.println("Nombre de synonymes de 'chien': " + d.Nombre_synonyme(m1));

        d.Supprimer_Mot(m2);
        d.listerDictionnaire();
    }
}
