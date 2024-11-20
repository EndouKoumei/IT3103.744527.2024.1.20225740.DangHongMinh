//Dang Hong Minh - 20225740
package lab3.AimsProject;
public class Aims {
    public static void main(String[] args) {
        System.out.println("\nAIMS Store Project:");
        System.out.println("---by Dang Hong Minh - 20225740---");
        //Create new cart
        Cart cart = new Cart();
        //Create new DVD object and add to cart
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
		//Display all DVDs in the cart
		cart.displayCart();
		//Print number of DVD in cart
		System.out.println("Number of DVD is: ");
        System.out.println(DigitalVideoDisc.getNbDigitalVideoDiscs());
		//Print ID of dvd3
        System.out.println("ID of dvd3 is: ");
        System.out.println(dvd3.getId());
	}
}