
import java.util.Scanner;

class Madate {

    private int jours;
    private int mois;
    private int anne;

    public Madate(int jours, int mois, int anne) {
        this.jours = jours;
        this.mois = mois;
        this.anne = anne;

    }

    public Madate(int anne) {
        jours = 1;
        mois = 1;
        this.anne = anne;
    }

    public int getjours() {
        return jours;
    }

    public int getMois() {
        return mois;
    }

    public int getAnne() {
        return anne;
    }

    public void setJours(int jours) {
        this.jours = jours;

    }

    public void setMois(int mois) {
        this.mois = mois;

    }

    public void setAnne(int anne) {
        this.anne = anne;

    }

    @Override
    public String toString() {
        return jours + "/" + mois + "/" + anne;
    }

    public int nbjdansmois() {
        switch (mois) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2, 4, 6, 9, 11 -> {
                return 30;
            }
            default -> {
                return 30;
            }
        }

    }

    public void ajouterunjours() {
        jours = jours + 1;
        if (jours > nbjdansmois()) {
            jours = 1;
            ajoutmois();

        }
    }

    public void ajoutmois() {
        mois = mois + 1;
        if (mois > 12) {
            mois = 1;
            ajouteranne();
        }
    }

    public void ajouterPjours(int n) {
        for (int i = 0; i < n; i++) {
            ajouterunjours();

        }
    }

    public void ajouteranne() {
        anne = anne + 1;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Madate d1 = new Madate(22, 5, 2025);
        Madate d2 = new Madate(2024);
        Madate d3 = new Madate(11, 6, 2000);

        System.out.println("affichage avant le modification ");
        System.out.println("le date 1: " + d1);
        System.out.println("le date 2: " + d2);
        System.out.println("le date 3: " + d3);
        d2.setJours(22);
        d2.setMois(5);
        System.out.println("le date 2 apres le modification sera :" + d2);
        System.out.println("menu a choisir");
        System.out.println("chois 1: Ajout d’un jour");
        System.out.println("chois 2: Ajout d’un plusieur jours");
        System.out.println("chois 3: Ajout d’un mois");
        System.out.println("chois 4: Ajout d’un anne");
        System.out.println("saisir votre choix svp :");
        int choix = s.nextInt();
        System.out.println("svp select le date:");
        int num = s.nextInt();
        Madate dateC = null;

        switch (num) {
            case 1 ->
                dateC = d1;
            case 2 ->
                dateC = d2;
            case 3 ->
                dateC = d3;
            default -> {
                System.out.println("invalide");
                return;
            }
        }

        switch (choix) {
            case 1 ->
                dateC.ajouterunjours();
            case 2 -> {
                System.out.println("combien nb jours ajoute :");
                int n = s.nextInt();
                dateC.ajouterPjours(n);
            }
            case 3 ->
                dateC.ajoutmois();
            case 4 ->
                dateC.ajouteranne();
            default ->
                System.out.println("invalide");
        }

        System.out.println("Nouvelle date : " + dateC);
        s.close();

    }

}
