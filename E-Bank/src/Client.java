public class Client extends Person{
    private int numeroClient;

    public Client(int identifiant, String nom,int numeroClient) {
        super(identifiant, nom);
        this.numeroClient=numeroClient;
    }

    public int getNumeroClient() {
        return numeroClient;
    }

    public void setNumeroClient(int numeroClient) {
        this.numeroClient = numeroClient;
    }

}
