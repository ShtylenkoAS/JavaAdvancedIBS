package gifts;

public class Jellybean extends Candy{
    private String color;

    public Jellybean(String name, double price, double weight, String color) {
        super(name, price, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Jellybean [" + super.toString() + ", color: " + color + "]";
    }
}
