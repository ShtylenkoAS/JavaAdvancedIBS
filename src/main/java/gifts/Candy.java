package gifts;

public abstract class Candy {
    private String name;
    private double price;
    private double weight;

    public Candy() {
    }

    public Candy(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name: " + name + ", price: " + price + ", weight: " + weight;
    }
}
