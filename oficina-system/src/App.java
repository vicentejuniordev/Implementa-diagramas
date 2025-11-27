public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema de Gerenciamento de Oficina Mecânica");

        Specialty specialty = new Specialty(1500.0, "Mecânica Geral");
        specialty.registerSpecialty();
        specialty.displaySpecialtyInfo();

        Employee employee = new Employee("João Silva ", "EMP123", specialty);
        employee.registerEmployee();
        employee.displayEmployeeInfo();     
        specialty.displaySpecialtyInfo();

        Automobile automobile = new Automobile("Gol", "Volkswagen", 2020, 120.0);
        automobile.registerAutomobile();
        automobile.displayAutomobileInfo();

        Fix fix = new Fix(java.sql.Date.valueOf("2024-06-15"), java.sql.Time.valueOf("10:30:00"), automobile, employee, specialty);
        fix.registerFix();
        fix.displayFixInfo();

    }
}
