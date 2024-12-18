//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.store;
import java.util.*;
import java.time.LocalDate;
import AimsProject.hust.soict.hedspi.aims.media.*;
import AimsProject.hust.soict.hedspi.aims.exception.*;
public class Store {
    private List<Media> itemsInStore = new ArrayList<Media>();
    public void addMedia(Media medium) throws DupplicatedItemException {
		if (this.itemsInStore.contains(medium) || medium.getTitle() == null) {
			throw new DupplicatedItemException();
		} else {
			medium.setDateAdded(LocalDate.now());
			this.itemsInStore.add(medium);
			System.out.println(medium.getTitle() + " has been added to store.");
		}
	}
	public void removeMedia(Media medium) throws NonExistingItemException {
		if (this.itemsInStore.remove(medium)) {
			System.out.println(medium.getTitle() + " has been removed from store.");
		} else {
			throw new NonExistingItemException(medium.getTitle() + " is not available at store.");
		}
	}
	public Media searchMedia(String title) {
		for (Media medium: this.itemsInStore) {
			if (medium.getTitle().toLowerCase().equals(title.toLowerCase())) {
				return medium;
			}
		}
		return null;
	}
	public void print() {
		System.out.println("\n");
		System.out.println("*************AVAILABLE MEDIA IN STORE**************");
		for (int i = 0; i < itemsInStore.size(); i++) {
			System.out.println(Integer.toString(i+1) + "." + "\t" + this.itemsInStore.get(i).getTitle() + "\t-\t" + this.itemsInStore.get(i).getType());
		}
		System.out.println("\n");
	}
	public ArrayList<Media> getItemsInStore() {
		return (ArrayList<Media>) this.itemsInStore;
	}
}