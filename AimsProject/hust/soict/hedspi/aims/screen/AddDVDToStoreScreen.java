//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.screen;
import java.io.IOException;
import javax.swing.JFrame;
import AimsProject.hust.soict.hedspi.aims.cart.Cart;
import AimsProject.hust.soict.hedspi.aims.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class AddDVDToStoreScreen extends AddItemToStoreScreen {
	public AddDVDToStoreScreen(Store store, Cart cart) {
		super(store, cart);
		JFrame frame = this;
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setTitle("Add DVD to store");
		this.setVisible(true);
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("addDVDToStore.fxml"));
					AddDVDToStoreScreenController controller = new AddDVDToStoreScreenController(store, cart, frame);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		});
	}
	public static void main(String[] args) {
		new AddDVDToStoreScreen(new Store(), new Cart());
	}
}