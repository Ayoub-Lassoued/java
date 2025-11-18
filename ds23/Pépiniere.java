
class Pépiniere {

    private Plante[] inventaire;
    final int maxPlante = 1000;
    private int nbPlante = 0;

    public Pépiniere() {

        this.inventaire = new Plante[maxPlante];
    }

    public void ajoutPlante(Plante plante) {
        if (nbPlante > maxPlante) {
            System.out.println("impossible de ajouter une plante");

        } else {
            inventaire[nbPlante] = plante;
            nbPlante++;

        }

    }

    public void afficherInventaire() {
        for (int i = 0; i < nbPlante; i++) {
            System.out.println("plante #" + (i + 1));
            inventaire[i].description();
            System.out.println();

        }
    }

    public double totalAbsorptionTotaleCO2() {
        double total = 0;
        for (int i = 0; i < nbPlante; i++) {
            if (!(inventaire[i] instanceof Arbre)) {
            } else {
                total += ((Arbre) inventaire[i]).absorptionCO2();
            }

        }
        return total;
    }

    public int compterArbresCaduques() {
        int x = 0;
        for (int i = 0; i < nbPlante; i++) {
            if (inventaire[i] instanceof Arbre) {
                Arbre a = (Arbre) inventaire[i];
                if (a.gettypeF().equals("Caduque")) {
                    x++;
                }
            }

        }
        return x;

    }

}
