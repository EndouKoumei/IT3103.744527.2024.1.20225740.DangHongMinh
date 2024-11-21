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
		DigitalVideoDisc [] dvdList = new DigitalVideoDisc[3];
		dvdList[0] = new DigitalVideoDisc("Green Miles", "Drama", "Frank Darabont", 279, 18.99f);
		dvdList[1] = new DigitalVideoDisc("Kimi no Na wa", "Romance", "Shinkai Makoto", 110, 12.59f);
		dvdList[2] = new DigitalVideoDisc("Spider Man", "Superhero", "Sam Raimi", 200, 15.29f);
        cart.addDigitalVideoDisc(dvdList); //test array method
		cart.addDigitalVideoDisc(dvd1, dvd2);
		/*cart.addDigitalVideoDisc(dvd1, dvd2, dvd3); //test diffnum method*/
		cart.displayCart();
		//Print total cost of the cart
		System.out.printf("Total = %.2f\n", cart.totalCost());
	}
}
