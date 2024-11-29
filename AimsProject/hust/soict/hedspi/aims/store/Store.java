//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedspi.aims.store;
import java.util.*;
import AimsProject.hust.soict.hedspi.aims.media.*;
public class Store {
    private List<Media> itemsInStore = new ArrayList<Media>();
    //Add a media
    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Already in the list");
            return;
        }
        itemsInStore.add(media);
        System.out.println("Added successfully");
    }
    //Remove a media
    public void removeMedia(Media media) {
        //Search for disc
        int indexOfRemoved = itemsInStore.indexOf(media);
        //If not found
        if (indexOfRemoved == -1) {
            System.out.println("Not found!");
            return;
        }
        //Remove
        itemsInStore.remove(indexOfRemoved);
        System.out.println("Removed successfully");
    }
    //Print all item in store
    public void printStore() {
        System.out.println("***********************STORE**********************");
        System.out.println("Items in store:");
        for (Media media : this.itemsInStore) {
            System.out.println(media.toString());
        }
        System.out.println("**************************************************");
    }
    //Search for media in store by ID
    public Media searchById(int id) {
        for (Media media: itemsInStore) {
            if (media.isMatch(id)) {
                return media;
            }
        }
        System.out.println("Not found!");
        return null;
    }
    //Search for media in store by title
    public Media searchByTitle(String title) {
        for (Media media: itemsInStore) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        System.out.println("Not found!");
        return null;
    }
    public List<Media> getItemsInStore() {
        return itemsInStore;
    }
    public void setItemsInStore(List<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }
}