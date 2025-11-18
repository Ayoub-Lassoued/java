
public class Bibliotheque {

    final Document[] listDoc;
    private int nbDoc;
    final int capacite;

    public Bibliotheque(int capacite) {
        this.capacite = capacite;
        this.nbDoc = 0;
        this.listDoc = new Document[capacite];
    }

    public int getCapacite() {
        return capacite;
    }

    public int getNombreDocument() {
        return nbDoc;
    }

    public void ajoutDoc(Document d) {
        if (nbDoc >= capacite) {
            System.out.println(" La bibliothèque est pleine !");
            return;
        }
        int i = nbDoc - 1;
        while (i >= 0 && listDoc[i].getNumero() > d.getNumero()) {
            listDoc[i + 1] = listDoc[i];
            i--;
        }
        listDoc[i + 1] = d;
        nbDoc++;
        System.out.println(" Document ajouté avec succès !");
    }

    public void supprimDoc(int num) {
        int index = -1;
        for (int i = 0; i < nbDoc; i++) {
            if (listDoc[i].getNumero() == num) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println(" Aucun document trouvé avec ce numéro !");
            return;
        }
        for (int i = index; i < nbDoc - 1; i++) {
            listDoc[i] = listDoc[i + 1];
        }
        listDoc[nbDoc - 1] = null;
        nbDoc--;
        System.out.println(" Document supprimé avec succès !");
    }

    public void inventaireDoc() {
        System.out.println("\n inventaireDocument  (" + nbDoc + "/" + capacite + ") :");
        for (int i = 0; i < nbDoc; i++) {
            listDoc[i].edition();
        }
    }

    public Bibliotheque listeLivre() {
        Bibliotheque b = new Bibliotheque(capacite);
        for (int i = 0; i < nbDoc; i++) {
            if (listDoc[i].getType().equals("livre")) {
                b.ajoutDoc(listDoc[i]);
            }
        }
        return b;
    }

    public Bibliotheque listeArticle() {
        Bibliotheque b = new Bibliotheque(capacite);
        for (int i = 0; i < nbDoc; i++) {
            if (listDoc[i].getType().equals("article")) {
                b.ajoutDoc(listDoc[i]);
            }
        }
        return b;
    }

    public Bibliotheque listedocsimple() {
        Bibliotheque b = new Bibliotheque(capacite);
        for (int i = 0; i < nbDoc; i++) {
            if (listDoc[i].getType().equals("article")) {
                b.ajoutDoc(listDoc[i]);
            }
        }
        return b;
    }

    public Bibliotheque listeperiodique() {
        Bibliotheque b = new Bibliotheque(capacite);
        for (int i = 0; i < nbDoc; i++) {
            if (listDoc[i].getType().equals("document")) {
                b.ajoutDoc(listDoc[i]);
            }
        }
        return b;
    }
}
