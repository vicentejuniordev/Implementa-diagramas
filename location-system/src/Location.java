import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class Location {
    private LocalDate dateLocation;
    private Time timeLocation;
    private LocalDate datePrevReturned;
    private Time timePrevReturn;
    private double mileageRetired;
    private double mileageReturned;
    private double valueSecurityDeposit;
    private double totalValueLocation;
    private LocalDate dateReturned;
    private Time timeReturned;
    private double dailyFine;;
    Client client;
    Automobile automobile;
    Employee employee;

    public Location(
            LocalDate dateLocation, Time timeLocation, LocalDate datePrevReturned, Time timePrevReturn,
            double mileageRetired, double mileageReturned, double valueSecurityDeposit,
            double totalValueLocation, LocalDate dateReturned, Time timeReturned,
            double dailyFine, Client client, Automobile automobile, Employee employee
        ) {

        this.dateLocation = dateLocation;
        this.timeLocation = timeLocation;
        this.datePrevReturned = datePrevReturned;
        this.timePrevReturn = timePrevReturn;
        this.mileageRetired = mileageRetired;
        this.mileageReturned = mileageReturned;
        this.valueSecurityDeposit = valueSecurityDeposit;
        this.totalValueLocation = totalValueLocation;
        this.dateReturned = dateReturned;
        this.timeReturned = timeReturned;
        this.dailyFine = dailyFine;
        this.client = client;
        this.automobile = automobile;
        this.employee = employee;
    }

    public void displayLocationInfo() {
        System.out.println("---------------------------");
        System.out.println("Informações da locação:");
        System.out.println("Data da Locação: " + dateLocation);
        System.out.println("Hora da Locação: " + timeLocation);
        System.out.println("Data da Devolução Anterior: " + datePrevReturned);
        System.out.println("Hora da Devolução Anterior: " + timePrevReturn);
        System.out.println("Quilometragem Retirada: " + mileageRetired);
        System.out.println("Quilometragem Devolvida: " + mileageReturned);
        System.out.println("Valor do Depósito de Segurança: " + valueSecurityDeposit);
        System.out.println("Valor Total da Locação: " + totalValueLocation);
        System.out.println("Data da Devolução: " + dateReturned);
        System.out.println("Hora da Devolução: " + timeReturned);
        System.out.println("Cliente: " + client.getName());
        System.out.println("Automóvel: " + automobile.getLicensePlate());
        System.out.println("Funcionário: " + employee.getName());
    }

    public void editLocation(
            LocalDate dateLocation, Time timeLocation, LocalDate datePrevReturned, Time timePrevReturn,
            double mileageRetired, double mileageReturned, double valueSecurityDeposit,
            double totalValueLocation, LocalDate dateReturned, Time timeReturned,
            double dailyFine, Client client, Automobile automobile, Employee employee
        ) {

        this.dateLocation = dateLocation;
        this.timeLocation = timeLocation;
        this.datePrevReturned = datePrevReturned;
        this.timePrevReturn = timePrevReturn;
        this.mileageRetired = mileageRetired;
        this.mileageReturned = mileageReturned;
        this.valueSecurityDeposit = valueSecurityDeposit;
        this.totalValueLocation = totalValueLocation;
        this.dateReturned = dateReturned;
        this.timeReturned = timeReturned;
        this.client = client;
        this.automobile = automobile;
        this.employee = employee;
        this.dailyFine = dailyFine;
    }

    public void registerLocation(List<Location> locations, Location location) {
        locations.add(location);
        System.out.println("Location registered successfully.");
    }
    
    public void closeLocation(List<Location> locations, Location location) {
        locations.remove(location);
        System.out.println("Location closed successfully.");
    }

    public double calcPrevTotalValueLocation(int days) {
        totalValueLocation = dailyFine * days;
        return totalValueLocation;
    }

    public double calcValueLocationWithDelay(int delayDays ) {
        return calcPrevTotalValueLocation(delayDays) + (delayDays * dailyFine);
    }




}
