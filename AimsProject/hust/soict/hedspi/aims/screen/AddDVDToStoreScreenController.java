//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.screen;
import javax.swing.JFrame;
import AimsProject.hust.soict.hedspi.aims.cart.Cart;
import AimsProject.hust.soict.hedspi.aims.exception.*;
import AimsProject.hust.soict.hedspi.aims.media.*;
import AimsProject.hust.soict.hedspi.aims.store.Store;
import javafx.beans.value.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
public class AddDVDToStoreScreenController extends AddItemToStoreScreenController {
	private String director;
	private int length;
	private Media dvd;
	@FXML
	private TextField tfDirector;
	@FXML
	private TextField tfLength;
	public AddDVDToStoreScreenController(Store store, Cart cart, JFrame stage) {
		super(store, cart, stage);
	}
	@FXML
	public void initialize() {
		tfDirector.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				director = newValue;
			}
		});
		tfLength.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				try {
					int number = Integer.parseInt(newValue);
					length = number;
				} catch (NumberFormatException e) {
					length = 0;
				}
			}
		});
		super.initialize();
	}
	@FXML
	@Override
	protected void addBtnPressed() {
		dvd = new DigitalVideoDisc(this.title, this.category, this.director, this.length, this.cost);
		try {
			store.addMedia(dvd);
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Notification");
			alert.setHeaderText("Success");
			alert.setContentText(dvd.getTitle() + " has been added to the store");
			alert.showAndWait();
		} catch (DupplicatedItemException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Notification");
			alert.setHeaderText("Failure");
			alert.setContentText("Failed to add DVD. Please enter valid information.");
			alert.showAndWait();
		}
	}
}