//Dang Hong Minh - 20225740
package lab2;
public class Cart {
    public static final int MAX_ITEMS = 20;
    //Create cart
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_ITEMS];
    //Current number of DVD
    private int qtyOrdered = 0;
    //Add DVD to cart
    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        //If cart not full
        if (qtyOrdered < MAX_ITEMS) {
            itemOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println(dvd.getTitle()+" has been added!");
            if (MAX_ITEMS - qtyOrdered == 1)
                System.out.println("Warning! The cart is almost full.");
        } else {
            System.out.println("The cart is full! Cannot add more DVDs.");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
        if(itemOrdered[0] ==  null) {
            System.out.println("ERROR! Your cart is empty!");
            return;
        }
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].equals(dvd)) {
                //Remove the disc
                for (int j = i; j < qtyOrdered - 1; j++)
                    itemOrdered[j] = itemOrdered[j + 1];
                itemOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println(dvd.getTitle() + " has been removed from cart!");
                return;
            }
        }
        //Disc not found
        System.out.println("ERROR! DVD not found in cart!");
    }
    public void displayCart() {
        System.out.println("\nCurrent DVDs in Cart:");
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
        } else {
            for (int i = 0; i < qtyOrdered; i++) {
                DigitalVideoDisc dvd = itemOrdered[i];
                System.out.printf("Title: %s | Cost: $%.2f%n", dvd.getTitle(), dvd.getCost());
            }
        }
    }
    public float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemOrdered[i].getCost();
        }
        return totalCost;
    }
}
