import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Bank {
    private String nom;
    private String codeBank;
    private List<Client> clients ;
    private List<Account> comptes;
    private List<SavingsAcount> savingaccounts;
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

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Account> getComptes() {
        return comptes;
    }

    public void setComptes(List<Account> comptes) {
        this.comptes = comptes;
    }

    public List<SavingsAcount> getSavingaccounts() {
        return savingaccounts;
    }

    public void setSavingaccounts(List<SavingsAcount> savingaccounts) {
        this.savingaccounts = savingaccounts;
    }

    public void ajouterClient(){
        System.out.println("Entrez le nom du client: ");
        String nom = Main.scanner.nextLine();
        System.out.println("Entrez le numero du Client");
        int numeroClient = Integer.parseInt(Main.scanner.nextLine());
        Client c = new Client(nom,numeroClient);
        clients.add(c);
        System.out.println("Client ajouté avec succes!");
    }

    public void creerCompte(){
        try{
        System.out.println("Entrez le numero du client");
        int numeroClient = Integer.parseInt(Main.scanner.nextLine());
        Client client= null;
        for (Client c : clients){
            if(c.getNumeroClient()==numeroClient ){
                client=c;
                break;
            }
        }
        if(client==null){
            System.out.println("Erreur : client introuvable.");
            return;
        }
            System.out.println("Entrez le solde initial: ");
            double solde = Double.parseDouble(Main.scanner.nextLine());
            String typeCompte= "Normal";
            Account a = new Account(solde,typeCompte,client.getNumeroClient(),client.getNom());
            comptes.add(a);
            System.out.println("Compte créé avec succès.");
        }

        catch(NumberFormatException e){
            System.out.println("Erreur : saisie invalide. Veuillez entrer des nombres valides.");
        }

    }

    public void afficherComptes() {
        for (Account c : comptes) {
            if (Objects.equals(c.getTypeCompte(), "Normal")) {
                System.out.println("Compte: " + c.getNumeroCompte() + "||" + "Solde: " + c.getSolde() + "||" + "Type: " + c.getTypeCompte());
            }
        }
    }


    public void supprimerCompte(Client client){
       try{
           System.out.println("Entrez le numero de compte à supprimer: ");
           int numeroCompte= Integer.parseInt(Main.scanner.nextLine());
           Account ac = null;
           for(Account a : comptes){
               if(a.getNumeroCompte()==numeroCompte) {
                   ac = a;
                   break;
               }
           }
           if(ac==null){
               System.out.println("Compte introuvable!");
               return;
           }
           comptes.remove(ac);
           System.out.println("Compte supprimé avec succès.");

       }
       catch(NumberFormatException e){
           System.out.println("ressayer d'entrer un numero correct");
       }
    }

    public void creerSavingAccount(){
        try{
            System.out.println("Veuillez entrer le numero de client: ");
            int numeroClient= Integer.parseInt(Main.scanner.nextLine());
            Client client = null;
            for(Client c : clients){
                if(c.getNumeroClient()==numeroClient) {
                    client = c;
                    break;
                }
            }
            if(client==null){
                System.out.println("Compte introuvable!");
                return;
            }
            System.out.println("Entrez le solde initial: ");
            double solde = Double.parseDouble(Main.scanner.nextLine());
            System.out.println("Entrez le taux");
            double taux = Double.parseDouble(Main.scanner.nextLine());
            String typeCompte= "Saving account";
            SavingsAcount acc = new SavingsAcount(solde,typeCompte,client.getNumeroClient(),client.getNom(),taux);
            savingaccounts.add(acc);
            comptes.add(acc);
            System.out.println("Compte creer avec succes!");

        }
        catch (NumberFormatException e){
            System.out.println("Erreur : saisie invalide.");

        }


    }

    public void calculerInterets(){

    }




}
