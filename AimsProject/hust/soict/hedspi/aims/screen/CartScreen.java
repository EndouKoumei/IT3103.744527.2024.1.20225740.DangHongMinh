//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.screen;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.JFrame;
import AimsProject.hust.soict.hedspi.aims.cart.Cart;
import AimsProject.hust.soict.hedspi.aims.media.*;
import AimsProject.hust.soict.hedspi.aims.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class CartScreen extends JFrame {
	public CartScreen(Store store, Cart cart) {
		super();
		this.setSize(1024,768);
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setTitle("Cart");
		this.setVisible(true);
		JFrame frame = this;
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new StoreScreen(store, cart);
				dispose();
			}
		});
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(
							getClass().getResource("cart.fxml"));
					CartScreenController controller = new CartScreenController(store, cart, frame);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void main(String args[]) throws Exception {
		// Test
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Goblin King", "Animation", "Someone", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sci-fi", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		Track track1 = new Track("Mondstadt", 10);
		Track track2 = new Track("Inazuma", 21);
		Track track3 = new Track("Natlan");
		CompactDisc cd1 = new CompactDisc("Bisoku SS1", "Animation", "Various", 30.95f);
		cd1.addTrack(track1);
		cd1.addTrack(track2);
		CompactDisc cd2 = new CompactDisc("Bisoku SS2", "Animation", "Various", 25.99f);
		cd2.addTrack(track3);
		Cart myCart = new Cart();
		myCart.addMedia(dvd1);
		myCart.addMedia(dvd2);
		myCart.addMedia(dvd3);
		myCart.addMedia(cd1);
		myCart.addMedia(cd2);
		Store myStore = new Store();
		new CartScreen(myStore, myCart);
	}
}