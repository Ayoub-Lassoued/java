
class Employe {

    protected String nom;
    protected double salaire;

    public Employe(String nom) {
        this.nom = nom;
    }

    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public double calculerSalaire() {
        return salaire;
    }

    public void setInfosSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }
}

class Employe_Ordinaire extends Employe {

    private double tauxHoraire;
    private int heures;

    public Employe_Ordinaire(String nom) {
        super(nom);
    }

    public Employe_Ordinaire(String nom, double tauxHoraire, int heures) {
        super(nom);
        this.tauxHoraire = tauxHoraire;
        this.heures = heures;
    }

    public void setInfosSalaire(double tauxHoraire, int heures) {
        this.tauxHoraire = tauxHoraire;
        this.heures = heures;
    }

    @Override
    public double calculerSalaire() {
        if (heures <= 39) {
            return tauxHoraire * heures;
        } else {
            return (39 * tauxHoraire) + ((heures - 39) * tauxHoraire * 1.3);
        }
    }
}

class Employe_Responsable extends Employe {

    private double tauxHoraire;
    private int heures;

    public Employe_Responsable(String nom) {
        super(nom);
    }

    public Employe_Responsable(String nom, double tauxHoraire, int heures) {
        super(nom);
        this.tauxHoraire = tauxHoraire;
        this.heures = heures;
    }

    public void setInfosSalaire(double tauxHoraire, int heures) {
        this.tauxHoraire = tauxHoraire;
        this.heures = heures;
    }

    @Override
    public double calculerSalaire() {
        if (heures <= 39) {
            return tauxHoraire * heures;
        } else {
            return (39 * tauxHoraire) + ((heures - 39) * tauxHoraire * 1.5);
        }
    }
}

class Commerciaux extends Employe {

    private double sommeFixe;
    private double chiffreAffaire;

    public Commerciaux(String nom) {
        super(nom);
    }

    public Commerciaux(String nom, double sommeFixe, double chiffreAffaire) {
        super(nom);
        this.sommeFixe = sommeFixe;
        this.chiffreAffaire = chiffreAffaire;
    }

    public void setInfosSalaire(double sommeFixe, double chiffreAffaire) {
        this.sommeFixe = sommeFixe;
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculerSalaire() {
        return sommeFixe + (0.01 * chiffreAffaire);
    }
}
