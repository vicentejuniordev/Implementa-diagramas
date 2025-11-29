import java.util.List;

public class Employee {
    private String name;
    private String adress;
    private String function;

    public Employee(String name, String adress, String function) {
        this.name = name;
        this.adress = adress;
        this.function = function;
    }

    public void registerEmploye( List<Employee> employees, Employee employee) {
        employees.add(employee);
        System.out.println(Colors.GREEN + "Funcionário registrado com sucesso!" + Colors.RESET);
        
    }

    public void editEmployee(List<Employee> employees, Employee employee, String newName, String newAdress, String newFunction) {
        String oldName = employee.name;
        employee.name = newName;
        employee.adress = newAdress;
        employee.function = newFunction;
        System.out.println(Colors.YELLOW + "Funcionário " + oldName + " editado com sucesso!" + Colors.RESET);
    }

    public void displayEmployeeInfo() {
        System.out.println("---------------------------");
        System.out.println("Nome: " + name);
        System.out.println("Endereço: " + adress);
        System.out.println("Função: " + function);
        
    }

    public void removeEmployee(List<Employee> employees, Employee employee) {
        employees.remove(employee);
        System.out.println(Colors.RED + "Funcionário(a) \"" + employee.name + "\" removido com sucesso!" + Colors.RESET);
    }

    public String getName() {
        return name;
    }

}
