public class Specialty {
    private double remuneration;
    private String specialty;

    public Specialty(double remuneration, String specialty) {
        this.remuneration = remuneration;
        this.specialty = specialty;
    }

    public Specialty registerSpecialty() {
        System.out.println("Especialidade registrada com sucesso!");
        return new Specialty(remuneration, specialty);
    }

    public void displaySpecialtyInfo() {
        System.out.println("-------------------------------");
        System.out.println("Especialidade: " + specialty);
        System.out.println("Remuneração: " + remuneration);
        
    }
}
