import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        //Implementação da classe Funcionário
        List<Employee> employees = new java.util.ArrayList<>();
        Employee emp1 = new Employee("Alice", "123 Main St", "Developer");
        Employee emp2 = new Employee("Bob", "456 Elm St", "Designer");
        emp1.registerEmploye(employees, emp1);
        emp2.registerEmploye(employees, emp2);
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp2.editEmployee(employees, emp2, "Robert", "789 Oak St", "Senior Designer");
        emp2.displayEmployeeInfo();
        emp1.removeEmployee(employees, emp1);
        
        for (Employee emp : employees) {
            emp.displayEmployeeInfo();
        }

        System.out.println("\n============================\n");

        //Implementação da classe Automóvel
        List<Automobile> automobiles = new java.util.ArrayList<>();
        Model model1 = new Model("Model S");
        Model model2 = new Model("Model 3");
        Brand brand1 = new Brand("Tesla", model1);
        Brand brand2 = new Brand("Tesla", model2);

        Automobile auto1 = new Automobile("ABC1234", "Red", "2020", "Electric", 4, 15000.0, "123456789", "1HGBH41JXMN109186", 299.99, brand1);
        Automobile auto2 = new Automobile("DEF5678", "White", "2019", "Electric", 4, 20000.0, "987654321", "1HGBH41JXMN109187", 249.99, brand2);
        Automobile auto3 = new Automobile("GHI9012", "Black", "2022", "Electric", 4, 18000.0, "456789123", "1HGBH41JXMN109188", 279.99, brand1);

        auto1.registerAutomobile(automobiles, auto1);
        auto1.displayAutomobileInfo();
        auto1.editAutomobile(automobiles, auto1, "XYZ5678", "Blue", "2021", "Electric", 4, 12000.0, "987654321", "1HGBH41JXMN109187", 349.99, brand1);
        auto1.displayAutomobileInfo();
        auto1.removeAutomobile(automobiles, auto1);

        auto2.registerAutomobile(automobiles, auto2);
        auto2.displayAutomobileInfo();

        auto3.registerAutomobile(automobiles, auto3);
        auto3.displayAutomobileInfo();

        for (Automobile auto : automobiles) {
            auto.displayAutomobileInfo();
        }

        //Implementação da classe Gerente
        Manager mgr1 = new Manager("Charlie", "321 Pine St", "Manager");
        mgr1.removeAutomobile(automobiles, auto3);

        for (Automobile auto : automobiles) {
            auto.displayAutomobileInfo();
        }

        //Implementação da classe Cliente
        List<Client> clients = new java.util.ArrayList<>();
        Client client1 = new Client("David", "11122233344", "654 Maple St", "555-1234", "david@example.com");
        Client client2 = new Client("Eva", "55566677788", "987 Oak St", "555-6789", "eva@example.com"); 

        client1.registerClient(clients, client1);
        client1.displayClientInfo();
        client1.editClient(clients, client1, "David", "11122233344", "654 Maple St", "555-5678", "david_new@example.com");
        client1.displayClientInfo();
        client1.removeClient(clients, client1);

        client2.registerClient(clients, client2);
        client2.displayClientInfo();

        for (Client client : clients) {
            client.displayClientInfo();
        }

        //Implementação da classe Locação
        System.out.println("\n============================\n");

        List<Location> locations = new java.util.ArrayList<>();
        Location loc1 = new Location(
            java.time.LocalDate.of(2024, 1, 10), java.sql.Time.valueOf("10:00:00"),
            java.time.LocalDate.of(2024, 1, 5), java.sql.Time.valueOf("10:00:00"),
            1000.0, 1500.0, 500.0, 300.0,
            java.time.LocalDate.of(2024, 1, 15), java.sql.Time.valueOf("10:00:00"), 50.0,
            client1, auto2, emp1
        );

        Location loc2 = new Location(
            java.time.LocalDate.of(2024, 2, 20), java.sql.Time.valueOf("14:00:00"),
            java.time.LocalDate.of(2024, 2, 15), java.sql.Time.valueOf("14:00:00"),
            2000.0, 2500.0, 600.0, 400.0,
            java.time.LocalDate.of(2024, 2, 25), java.sql.Time.valueOf("14:00:00"), 60.0,
            client2, auto1, emp2
        );


        
        loc1.registerLocation(locations, loc1);
        loc1.displayLocationInfo();
        loc1.closeLocation(locations, loc1);

        loc2.registerLocation(locations, loc2);
        loc2.displayLocationInfo();
    
        for (Location loc : locations) {
            loc.displayLocationInfo();
        }
    
    
    
    
    }
}
