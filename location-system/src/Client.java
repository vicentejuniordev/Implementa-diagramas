import java.util.List;

public class Client {
    private String name;
    private String cpf;
    private String adress;
    private String phoneNumber;
    private String email;

    public Client(String name, String cpf, String adress, String phoneNumber, String email) {
        this.name = name;
        this.cpf = cpf;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void displayClientInfo() {
        System.out.println("---------------------------");
        System.out.println("Nome: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + adress);
        System.out.println("Telefone: " + phoneNumber);
        System.out.println("Email: " + email);
    }

    public void registerClient(List<Client> clients, Client client) {
        clients.add(client);
        System.out.println(Colors.GREEN + "Cliente registrado com sucesso!" + Colors.RESET);
    }

    public void editClient(List<Client> clients, Client client, String name, String cpf, String adress, String phoneNumber, String email) {
        client.name = name;
        client.cpf = cpf;
        client.adress = adress;
        client.phoneNumber = phoneNumber;
        client.email = email;
        System.out.println(Colors.YELLOW + "Cliente editado com sucesso!" + Colors.RESET);
    }

    public void removeClient(List<Client> clients, Client client) {
        clients.remove(client);
        System.out.println(Colors.RED + "Cliente removido com sucesso!" + Colors.RESET);
    }

    public String getName() {

        return name;
    }
}