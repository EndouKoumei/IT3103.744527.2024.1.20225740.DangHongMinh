//Dang Hong Minh - 20225740
package lab2.AimsProject;

public class Aims {
    public static void main(String[] args) {
        System.out.println("\nAIMS Store Project:");
        System.out.println("---by Dang Hong Minh - 20225740---");
        // Create new cart
        Cart cart = new Cart();
        // Create new DVD object and add to cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc
		("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc
		("Star Wars", "Sci-Fi", "George Lucas", 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc
		("Aladin", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc
		("Avatar", "Sci-Fi", 32.99f);
        cart.addDigitalVideoDisc(dvd4);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc
		("Fate/Stay Night", "Animation", 12.99f);
        cart.addDigitalVideoDisc(dvd5);
       	//Test remove
		cart.removeDigitalVideoDisc(dvd2);
		//Remove failed
		cart.removeDigitalVideoDisc(dvd2);
        //Test add
		cart.addDigitalVideoDisc(dvd2);
		// Display all DVDs in the cart
		cart.displayCart();
		//Print total cost of the cart
		System.out.printf("Total = %.2f\n", cart.totalCost());
	}
}
