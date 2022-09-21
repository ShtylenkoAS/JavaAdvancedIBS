package gifts;

public class Chocolate extends Candy {
    private String brand;

    public Chocolate(String name, double price, double weight, String brand) {
        super(name, price, weight);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Chocolate [" + super.toString() + ", brand: " + brand + "]";
    }
}
