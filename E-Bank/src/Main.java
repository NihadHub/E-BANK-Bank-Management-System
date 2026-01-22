import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static Bank bank = new Bank("BMCE","A1B2C3");

    public static void main(String[] args){
        afficherMenu();
    }

    static void afficherMenu(){
        int choix;

        do{
            Menu();
            choix= lirechoix();

            switch (choix){
                case 1: bank.afficherComptes();
                    break;
                case 2: bank.ajouterClient();
                    break;
                case 3: bank.creerCompte();
                    break;
                case 4: bank.consulterSolde();
                    break;
                case 5: bank.deposer();
                    break;
                case 6: bank.retirer();
                    break;
                case 7: bank.supprimerCompte();
                    break;
                case 8: bank.creerSavingAccount();
                    break;
                case 9:
                    System.out.println("Intérèt: "+ bank.calculerInterets());
                    break;
                case 10: Excel.execute();
                    break;
                case 0:
                    System.out.println(" Au revoir !");
                    break;
                default:
                    System.out.println("choix invalide!");
            }

        }while (choix!=0);


    }
    static void Menu(){
        System.out.println("-----Gestion Bancaire - E-bank----- ");
        System.out.println("1. Afficher tous les comptes");
        System.out.println("2. Ajouter un client");
        System.out.println("3. Créer un compte bancaire");
        System.out.println("4. Consulter le solde");
        System.out.println("5. Déposer de l'argent");
        System.out.println("6. Retirer de l'argent");
        System.out.println("7. Supprimer un compte");
        System.out.println("8. Créer un compte épargne");
        System.out.println("9. Calculer les intérêts");
        System.out.println("10. Exporter vers Excel");
        System.out.println("0. Quitter");
        System.out.print("Choix : ");
    }
    static int lirechoix(){
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
        }


