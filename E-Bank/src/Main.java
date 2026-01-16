import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        ArrayList<Client>clients=new ArrayList<>();
        ArrayList<Account>comptes=new ArrayList<>();
        Bank bank= new Bank("ATIJARI","123AB",clients,comptes);
        bank.ajouterClient(new Client(1,"Nihad",123));
        bank.creerCompte(new Account("ab1536",5003,"Normal"));
        bank.afficherComptes();

    }
}
