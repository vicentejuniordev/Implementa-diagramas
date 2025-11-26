import java.sql.Date;

public class Player {
    private String name;
    private String address;
    private String phoneNumber;
    private Date birthDate;
    private int levelHability;
    int numberOfVictories;
    int numberOfDefeats;

    public Player(String name, String address, String phoneNumber, Date birthDate, int levelHability) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.levelHability = levelHability;
        this.numberOfVictories = 0;
        this.numberOfDefeats = 0;
    }

    public int getAge() {
        Date currentDate = new Date(System.currentTimeMillis());
        long ageInMillis = currentDate.getTime() - birthDate.getTime();
        return (int) (ageInMillis / (1000L * 60 * 60 * 24 * 365));
    }

    public void infoPlayer() {
        System.out.println("-------------------------");
        System.out.println("Nome: " + name);
        System.out.println("Endereço: " + address);
        System.out.println("Número de Telefone: " + phoneNumber);
        System.out.println("Data de Nascimento: " + birthDate);
        System.out.println("Idade: " + getAge());
        System.out.println("Nível de Habilidade: " + levelHability);
        System.out.println("Número de Vitórias: " + numberOfVictories);
        System.out.println("Número de Derrotas: " + numberOfDefeats);
        System.out.println("-------------------------");
    }

    public String getName() {
        return name;
    }



}
