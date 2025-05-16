package github.pedrozaz.springarchitecture.manufacturers;

public class Key {
    private Manufacturers manufacturers;
    private String type;

    public Manufacturers getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(Manufacturers manufacturers) {
        this.manufacturers = manufacturers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
