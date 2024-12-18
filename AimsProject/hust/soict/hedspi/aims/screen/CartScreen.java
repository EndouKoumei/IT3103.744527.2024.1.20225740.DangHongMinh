package AimsProject.hust.soict.hedspi.aims.screen;
import java.io.IOException;
import java.awt.event.*;
import javax.swing.JFrame;
import AimsProject.hust.soict.hedspi.aims.cart.Cart;
import AimsProject.hust.soict.hedspi.aims.store.Store;
import AimsProject.hust.soict.hedspi.aims.media.*;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class CartScreen extends JFrame {
	private Store store;
	private Cart cart;
	public CartScreen(Store store, Cart cart) {
		super();
		this.store = store;
		this.cart = cart;
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
}