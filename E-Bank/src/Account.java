public class Account {
    private static int accountCounter=1;
    private int numeroCompte;
    private double solde;
    private String typeCompte;
    private int numeroClient;
    private String nom;

    public Account( double solde, String typeCompte,int numeroClient,String nom) {
        this.solde = solde;
        this.typeCompte = typeCompte;
        this.numeroClient = numeroClient;
        this.numeroCompte=accountCounter;
        this.nom=nom;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
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
