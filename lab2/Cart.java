//Dang Hong Minh - 20225740
package lab2;
import java.util.ArrayList;
public class Cart {
    private ArrayList<DigitalVideoDisc> items;
    private static final int MAX_ITEMS = 20;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (items.size() < MAX_ITEMS) {
            items.add(dvd);
        } else {
            System.out.println("Cart is full! Cannot add more DVDs.");
        }
    }

    public void removeDVD(String title) {
        boolean removed = items.removeIf(dvd -> dvd.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("DVD removed from cart.");
        } else {
            System.out.println("DVD not found in cart.");
        }
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("\nCurrent DVDs in Cart:");
            for (DigitalVideoDisc dvd : items) {
                System.out.println(dvd);
            }
        }
    }

    public float calculateTotalCost() {
        float totalCost = 0;
        for (DigitalVideoDisc dvd : items) {
            totalCost += dvd.getCost();
        }
        return totalCost;
    }
}