import gifts.*;

/**
 * @author by Anton Shtylenko
 */
public class Task03SweetGift {
    public static void main(String[] args) {
        Jellybean jellybean = new Jellybean("Gold Bear", 60, 15, "Yellow");
        Bounty bounty = new Bounty("New-York", 80, 14, "USA");
        Chocolate chocolate = new Chocolate("Alpen Golde", 75, 12, "Kraft Foods");
        Candy[] gift = {jellybean, bounty, chocolate};

        double totalSum = 0;
        double totalWeight = 0;

        for (Candy candy : gift) {
            System.out.println(candy.toString());
            totalSum = totalSum + candy.getPrice();
            totalWeight = totalWeight + candy.getWeight();
        }

        System.out.println("Summary cost gift: " + totalSum);
        System.out.println("Summary weight gift: " + totalWeight);
    }
}
