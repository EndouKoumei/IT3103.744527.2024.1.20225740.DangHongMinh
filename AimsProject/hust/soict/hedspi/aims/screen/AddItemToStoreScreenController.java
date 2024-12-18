//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.screen;
import javax.swing.JFrame;
import AimsProject.hust.soict.hedspi.aims.cart.Cart;
import AimsProject.hust.soict.hedspi.aims.store.Store;
import javafx.beans.value.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
public abstract class AddItemToStoreScreenController {
	protected Store store;
	protected Cart cart;
	private JFrame stage;
	protected String title;
	protected String category;
	protected float cost;
	@FXML
	protected TextField tfTitle;
	@FXML
	protected TextField tfCategory;
	@FXML
	protected TextField tfCost;
	public AddItemToStoreScreenController(Store store, Cart cart, JFrame stage) {
		super();
		this.store = store;
		this.cart = cart;
		this.stage = stage;
	}
	@FXML
	public void initialize() {
		tfTitle.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				title = newValue;
			}
		});
		tfCategory.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				category = newValue;
			}	
		});
		tfCost.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				try {
					Float number = Float.parseFloat(newValue);
					cost = number;
				} catch (NumberFormatException e) {
					cost = 0f;
				}
			}
		});
	}
	@FXML
	protected void viewStore() {
		new StoreScreen(store, cart);
	    stage.setVisible(false);
	}
	@FXML
	protected void viewCart() {
		new CartScreen(store, cart);
	    stage.setVisible(false);
	}
	@FXML
	protected void addBookToStore() {
		new AddBookToStoreScreen(store, cart);
	    stage.setVisible(false);
	}
	@FXML
	protected void addCDToStore() {
		new AddCDToStoreScreen(store,cart);
	    stage.setVisible(false);
	}
	@FXML
	protected void addDVDToStore() {
		new AddDVDToStoreScreen(store, cart);
	    stage.setVisible(false);
	}
	@FXML
	protected abstract void addBtnPressed();
}