import java.util.List;

public class Manager extends Employee {
    
    public Manager(String name, String adress, String function) {
        super(name, adress, function);
    }

    public void removeAutomobile(List<Automobile> automobiles, Automobile automobile) {
        automobiles.remove(automobile);
        System.out.println(Colors.RED + "Automóvel removido com sucesso!" + Colors.RESET);
    }
    
}
