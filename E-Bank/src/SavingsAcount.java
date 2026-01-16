public class SavingsAcount extends Account{
    private double taux;

    public SavingsAcount(String numeroCompte, double solde, String typeCompte,double taux) {
        super(numeroCompte, solde, typeCompte);
        this.taux=taux;
    }

    public double calculerIntere(){
        return getSolde()*taux/100;
    }

}

