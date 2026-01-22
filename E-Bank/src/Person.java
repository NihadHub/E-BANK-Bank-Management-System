public class Person {
    private static int idCounter = 1;
    private int identifiant;
    private String nom;

    public Person( String nom) {
        this.identifiant = idCounter ++;
        this.nom = nom;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
