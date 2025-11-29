import java.util.List;

public class Automobile {
    private String plate;
    private String color;
    private String ano;
    private String typeFuel;
    private int numberDoors;
    private double mileage;
    private String renavam; 
    private String chassi;
    private double valueLocation;
    private boolean isLocated;
    private Brand brand;

    public Automobile(
        String plate, String color, String ano, String typeFuel, int numberDoors,
        double mileage, String renavam, String chassi, double valueLocation, Brand brand) {
        this.plate = plate;
        this.color = color;
        this.ano = ano;
        this.typeFuel = typeFuel;
        this.numberDoors = numberDoors;
        this.mileage = mileage;
        this.renavam = renavam;
        this.chassi = chassi;
        this.valueLocation = valueLocation;
        this.brand = brand;
        this.isLocated = false;
    }

    public void registerAutomobile(List<Automobile> automobiles, Automobile automobile) {
        automobiles.add(automobile);
        System.out.println(Colors.GREEN + "Automóvel registrado com sucesso!" + Colors.RESET);
    }

    public void editAutomobile(
        List<Automobile> automobiles, Automobile automobile,
        String newPlate, String newColor, String newAno, String newTypeFuel,
        int newNumberDoors, double newMileage, String newRenavam,
        String newChassi, double newValueLocation, Brand newBrand) {

        String oldPlate = automobile.plate;
        automobile.plate = newPlate;
        automobile.color = newColor;
        automobile.ano = newAno;
        automobile.typeFuel = newTypeFuel;
        automobile.numberDoors = newNumberDoors;
        automobile.mileage = newMileage;
        automobile.renavam = newRenavam;
        automobile.chassi = newChassi;
        automobile.valueLocation = newValueLocation;
        automobile.brand = newBrand;

        System.out.println(Colors.YELLOW + "Automóvel " + oldPlate + " editado com sucesso!" + Colors.RESET);
    }
    public void displayAutomobileInfo() {
        System.out.println("---------------------------");
        System.out.println("Placa: " + plate);
        System.out.println("Cor: " + color);
        System.out.println("Ano: " + ano);
        System.out.println("Marca: " + (brand != null ? brand.toString() : ""));
        System.out.println("Tipo de Combustível: " + typeFuel);
        System.out.println("Número de Portas: " + numberDoors);
        System.out.println("Quilometragem: " + mileage);
        System.out.println("Renavam: " + renavam);
        System.out.println("Chassi: " + chassi);
        System.out.println("Valor de Locação: " + valueLocation);
        System.out.println("Está Locado: " + (isLocated ? "Sim" : "Não"));
    }
    

    public void removeAutomobile(List<Automobile> automobiles, Automobile automobile) {
        automobiles.remove(automobile);
        System.out.println(Colors.RED + "Automóvel \"" + automobile.plate + "\" removido com sucesso!" + Colors.RESET);
    }

    public String getLicensePlate() {
        return plate;
    }
}
