import java.sql.Date;
import java.sql.Time;

public class Fix {
    private Date dateFix;
    private Time timeFix;
    private Automobile automobile;
    private Employee employee;
    private Specialty specialty;

    public Fix(Date dateFix, Time timeFix, Automobile automobile, Employee employee, Specialty specialty) {
        this.dateFix = dateFix;
        this.timeFix = timeFix;
        this.automobile = automobile;
        this.employee = employee;
        this.specialty = specialty;
    }

    public Fix registerFix() {
        System.out.println("Conserto registrado com sucesso!");
        return new Fix(dateFix, timeFix, automobile, employee, specialty);
    }   

    public void displayFixInfo() {
        System.out.println("Data do conserto: " + dateFix);
        System.out.println("Hora do conserto: " + timeFix);
        automobile.displayAutomobileInfo();
        employee.displayEmployeeInfo();
        specialty.displaySpecialtyInfo();
    }
    
}
