//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.screen;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import AimsProject.hust.soict.hedspi.aims.cart.Cart;
import AimsProject.hust.soict.hedspi.aims.store.Store;
public class AddItemToStoreScreen extends JFrame {
	public AddItemToStoreScreen(Store store, Cart cart) {
		super();
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new StoreScreen(store, cart);
			}
		});
	}
}