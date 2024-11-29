//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.cart;
import java.util.*;
import AimsProject.hust.soict.hedspi.aims.media.*;
public class Cart {
    private static final int MAX_ITEM = 20;
    //Attribute
    private List<Media> itemsOrdered = new ArrayList<Media>(MAX_ITEM);
    private int qtyOrdered = 0;
    //Add new media
	public void addMedia(Media media) {
		if (itemsOrdered.size() < MAX_ITEM) {
			itemsOrdered.add(media);
            qtyOrdered++;
			System.out.println(media.getTitle() + " has been added!");
		    //Check if the cart is almost full
            if (MAX_ITEM - itemsOrdered.size() == 1) {
                System.out.println("Warning! The cart is almost full.");
            }
        } else {
            System.out.println("The cart is full! Cannot add more items.");
        }
    }  
    //Remove media
	public void removeMedia(Media media) {
        if (itemsOrdered.isEmpty()) {
            System.out.println("ERROR! Your cart is empty!");
            return;
        }
	    boolean found = false; 
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).equals(media)) {
                itemsOrdered.remove(i);
                qtyOrdered--;
                System.out.println(media.getTitle() + " has been removed!");
                found = true;
                break;
            }
        }
	    if (!found) {
	        System.out.println(media.getTitle() + " is not in the cart.");
	    }
	}
    public List<Media> getItemsInCart() {
        return itemsOrdered;
    }
    //Calculate total cost
    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }
    //Print list of ordered items in cart, the price of items, and total price
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0 ; i < itemsOrdered.size(); i++) {
            System.out.println((i+1) + itemsOrdered.get(i).toString());        }
        System.out.println("Total cost: $" + totalCost());
        System.out.println("**************************************************");
    }
    //Search for media in cart by title and display results
    public void searchTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************CART***********************");
        System.out.println("Enter the title: ");
        String title = scanner.nextLine();
        boolean itemFound = false;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getTitle().equals(title)) {
                itemFound = true;
                System.out.println("Media found: " + itemsOrdered.get(i).toString());          
            }
        }
        if (!itemFound) {
            System.out.println(title + " not found!");
        }
        System.out.println("**************************************************");
        scanner.close();
    }
    //Search for media in cart by ID and display results
    public void searchId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************CART***********************");
        System.out.println("Enter the ID: ");
        int id = scanner.nextInt();
        boolean itemFound = false;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getId() == id) {
                itemFound = true;
                System.out.println("Media found: " + itemsOrdered.get(i).toString());
            }
        }
        if (!itemFound) {
            System.out.println("ID " + id + " not found!");
        }
        System.out.println("**************************************************");
        scanner.close();
    }
    public void emptyCart() {
        itemsOrdered.clear();
        qtyOrdered = 0;
        System.out.println("Cart is now empty!");
    }
    //Sort by title and print
    public void sortByTitle() {
        itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
        printCart();
    }
    //Sort by cost and print
    public void sortByCost() {
        itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
        printCart();
    }
    public int getQty() {
        return qtyOrdered;
    }
    public void setQty(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
}