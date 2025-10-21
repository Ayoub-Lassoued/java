
public class paie {

    public static void main(String[] args) {
        Employe[] employes = new Employe[5];

        Employe_Ordinaire e1 = new Employe_Ordinaire("Ayoub Lassoued");
        e1.setInfosSalaire(10, 42);

        Employe_Responsable e2 = new Employe_Responsable("Adem Lassoued", 12, 45);

        Commerciaux c1 = new Commerciaux("Aziz Lassoued", 600, 10000);
        Commerciaux c2 = new Commerciaux("Ayoub Lassoued", 550, 8000);
        Commerciaux c3 = new Commerciaux("Adem Lassoued", 700, 15000);

        employes[0] = e1;
        employes[1] = e2;
        employes[2] = c1;
        employes[3] = c2;
        employes[4] = c3;

        for (Employe e : employes) {
            System.out.println(e.getNom() + " gagne " + e.calculerSalaire() + " D");
        }
    }
}
