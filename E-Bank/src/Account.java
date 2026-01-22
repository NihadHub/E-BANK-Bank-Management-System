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






}
