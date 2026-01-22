public class Client extends Person{
    private int numeroClient;

    public Client( String nom,int numeroClient) {
        super( nom);
        this.numeroClient=numeroClient;
    }

    public int getNumeroClient() {
        return numeroClient;
    }

    public void setNumeroClient(int numeroClient) {
        this.numeroClient = numeroClient;
    }

}
