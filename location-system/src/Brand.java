public class Brand {
    private String name;
    Model model;

    public Brand(String name, Model model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public Model getModel() {
        return model;
    }
    
}