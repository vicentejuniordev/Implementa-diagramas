public class Automobile {
    private String model;
    private String brand;
    private int year;
    private double power;

    public Automobile(String model, String brand, int year, double power) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.power = power;
    }

    public Automobile registerAutomobile() {
        System.out.println("Automóvel registrado com sucesso!");
        return new Automobile(model, brand, year, power);
    }

    public void displayAutomobileInfo() {
        System.out.println("Modelo do automóvel: " + model);
        System.out.println("Marca do automóvel: " + brand);
        System.out.println("Ano do automóvel: " + year);
        System.out.println("Potência do automóvel: " + power + " HP");
    }

    
}