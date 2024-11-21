//Dang Hong Minh - 20225740
package lab3.AimsProject;
public class Cart {
    public static final int MAX_ITEMS = 20;
    //Create cart
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_ITEMS];
    //Current number of DVD
    private int qtyOrdered = 0;
    //Add DVD to cart
    //Original version
    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        //If cart not full
        if (qtyOrdered < MAX_ITEMS) {
            itemOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println(dvd.getTitle() + " has been added!");
            if (MAX_ITEMS - qtyOrdered == 1)
                System.out.println("Warning! The cart is almost full.");
        } else {
            System.out.println("The cart is full! Cannot add more DVDs.");
        }
    }
    //Overloading version
    //Array method
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (qtyOrdered < MAX_ITEMS) {
                itemOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println(dvd.getTitle() + " has been added!");
            } else {
                System.out.println("The cart is full! Cannot add more DVDs.");
            }
        }
        if (MAX_ITEMS - qtyOrdered == 1) {
            System.out.println("Warning! The cart is almost full.");
        }
    }
    /*//Variable-length argument lists
    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            if (qtyOrdered < MAX_ITEMS) {
                itemOrdered[qtyOrdered] = dvd;
				qtyOrdered++;
                System.out.println(dvd.getTitle() + " has been added!");
            } else {
                System.out.println("The cart is full! Cannot add more DVDs.");
                break;
            }
        }
        if (MAX_ITEMS - qtyOrdered == 1) {
            System.out.println("Warning! The cart is almost full.");
        }
    }*/
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 <= MAX_ITEMS){
			itemOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			itemOrdered[qtyOrdered] = dvd2;
			System.out.println(dvd1.getTitle() + " and " + dvd2.getTitle() + " has been added!");
			qtyOrdered++;
		} else {
            System.out.println("The cart is full! Cannot add more DVDs.");
        }
        if (MAX_ITEMS - qtyOrdered == 1) {
            System.out.println("Warning! The cart is almost full.");
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
    public String toString(){
        String result = "";
        for (int i = 0; i < qtyOrdered; i++) {
            result += "\n" + itemOrdered[i].toString();
        }
        return result;
        }
    //Show cart info
    public void printCart(){
        System.out.printf("\n***********************CART***********************\n");
        System.out.printf("Ordered Items:");
        System.out.println(toString());
        System.out.printf("Total cost: $%.2f\n", totalCost());
        System.out.printf("**************************************************\n");
    }
    //Search in cart
    public void searchCart(int id){ //Search by ID
        int check = 0;
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemOrdered[i].isMatch(id)) {
                check = 1;
                System.out.printf("Found item with ID %d!\n", id);
                System.out.println(itemOrdered[i].toString());
                break;
            }
        }
        if (check == 0) System.out.println("Not Found!\n");
    }
    public void searchCart(String title){ //Search by title
        int check = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].isMatch(title)) {
                check = 1;
                System.out.printf("Found item with title included %s!\n", title);
                System.out.println(itemOrdered[i].toString());
                break;
            }
        }
        if (check == 0) System.out.println("Not Found!\n");
    }
}
