//Dang Hong Minh - 20225740
package lab3.AimsProject;
public class CartTest {
    	public static void main(String[] args){
		Cart cart = new Cart();
		DigitalVideoDisc [] dvdList = new DigitalVideoDisc[3];
		dvdList[0] = new DigitalVideoDisc("Green Miles", "Drama", "Frank Darabont", 279, 18.99f);
		dvdList[1] = new DigitalVideoDisc("Kimi no Na wa", "Romance", "Shinkai Makoto", 110, 12.59f);
		dvdList[2] = new DigitalVideoDisc("Spider Man", "Superhero", "Sam Raimi", 200, 15.29f);
		cart.addDigitalVideoDisc(dvdList);
		// print items in cart and total cost
		cart.printCart();
		cart.searchCart("Kimi no Na wa");
		cart.searchCart(1);
	}
}