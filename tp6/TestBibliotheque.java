
class TestBibliotheque {

    public static void main(String args[]) {
        Bibliotheque b = new Bibliotheque(5);
        b.ajoutDoc(new Document("test a", 2, 120));
        b.ajoutDoc(new Periodique("test b", 3, 150, 2));
        b.ajoutDoc(new Livre("test c ", 4, 190, "ahmed", "ld"));
        b.ajoutDoc(new Article("testa a", 5, 3, "ayoub"));
        b.inventaireDoc();
        System.out.println(" je suprime le document num  2  ");
        b.supprimDoc(2);
        b.inventaireDoc();

    }

}
