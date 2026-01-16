public class Account {
    private String numeroCompte;
    private double solde;
    private String typeCompte;

    public Account(String numeroCompte, double solde, String typeCompte) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.typeCompte = typeCompte;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    @Override
    public String toString() {
        return "Votre solde actuel est: "+this.solde+"DH.";
    }

    public void deposer(double montant){
        if (montant>=50){ solde+=montant;
        }
        else {
            System.out.println("Montant invalide!");
        }
    }

    public void retirer(double montant){
        if (solde>=montant){
            solde-=montant;
        }else {
            System.out.println("Solde insuffisant");
        }
    }
}
