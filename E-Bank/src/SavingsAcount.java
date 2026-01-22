public class SavingsAcount extends Account{
    private double taux;

    public SavingsAcount(double solde, String typeCompte, int numeroClient, String nom, double taux) {
        super(solde, typeCompte, numeroClient, nom);
        this.taux = taux;
    }



}

