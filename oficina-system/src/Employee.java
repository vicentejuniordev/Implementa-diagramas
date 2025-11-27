public class Employee {
    private String name;
    private String registration;
    private Specialty specialty;

    public Employee(String name, String registration, Specialty specialty) {
        this.name = name;
        this.registration = registration;
        this.specialty = specialty;
    }

    public Employee registerEmployee() {
        System.out.println("Funcionário registrado com sucesso!");
        return new Employee(name, registration, specialty);
       
    }

    public void displayEmployeeInfo() {
        System.out.println("-------------------------------");
        System.out.println("Nome do funcionário: " + name);
        System.out.println("Matrícula do funcionário: " + registration);
        
    }

}