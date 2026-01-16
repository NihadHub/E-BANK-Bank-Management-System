import java.util.List;
import java.util.ArrayList;
public class Bank {
    private String nom;
    private String codeBank;
    private List<Client> clients = new ArrayList<>() ;
    private List<Account> comptes= new ArrayList<>();

    public Bank(String nom, String codeBank, List<Client> clients, List<Account> comptes) {
        this.nom = nom;
        this.codeBank = codeBank;
        this.clients = clients;
        this.comptes = comptes;
    }

    public String getCodeBank() {
        return codeBank;
    }

    public void setCodeBank(String codeBank) {
        this.codeBank = codeBank;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void ajouterClient(Client client){
        clients.add(client);
    }

    public void creerCompte(Account account){
        comptes.add(account);
    }

    public void afficherComptes(){
        for(Account c:comptes){
            System.out.println("Compte: "+ c.getNumeroCompte()+ "||"+"Solde: "+c.getSolde()+ "||"+"Type: "+c.getTypeCompte());
        }
    }

    public void supprimerCompte(Client client){
        clients.remove(client);
    }

    public void creerSavingAccount(int numeroCompte, double solde, String type, double taux){


    }
}
