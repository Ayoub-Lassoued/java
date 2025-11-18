
class Mot_dict {

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

    public boolean synonyme(String description) {
        return this.description.equals(description);
    }

    public boolean synonyme(Mot_dict mot_dict) {
        return this.description.equals(mot_dict.description);
    }
}
