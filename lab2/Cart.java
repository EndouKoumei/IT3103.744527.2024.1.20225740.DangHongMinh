//Dang Hong Minh - 20225740
package lab2;
public class Cart {
    public static final int MAX_ITEMS = 20;
    //Create cart
    private DigitalVideoDisc items[] = new DigitalVideoDisc[MAX_ITEMS];
    //Current number of DVD
    private int quantity = 0;
    //Add DVD to cart
    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        //If cart not full
        if (quantity < MAX_ITEMS) {
            items[quantity] = dvd;
            quantity++;
            System.out.println(dvd.getTitle()+" has been added!");
            if (MAX_ITEMS - quantity == 1)
                System.out.println("Warning! The cart is almost full.");
        } else {
            System.out.println("The cart is full! Cannot add more DVDs.");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
        if(items[0] ==  null) {
            System.out.println("ERROR! Your cart is empty!");
            return;
        }
        for (int i = 0; i < quantity; i++) {
            if (items[i].equals(dvd)) {
                //Remove the disc
                for (int j = i; j < quantity - 1; j++)
                    items[j] = items[j + 1];
                items[quantity - 1] = null;
                quantity--;
                System.out.println(dvd.getTitle() + " has been removed from cart!");
                return;
            }
        }
        //Disc not found
        System.out.println("ERROR! DVD not found in cart!");
    }
    public float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < quantity; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }
}