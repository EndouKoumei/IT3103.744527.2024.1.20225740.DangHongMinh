//Dang Hong Minh - 20225740
package AimsProject.hust.soict.hedpsi.aims.store;
import AimsProject.hust.soict.hedpsi.aims.disc.DigitalVideoDisc;
public class Store {
    private DigitalVideoDisc itemInStore[];
    private int numberOfItems;
    public Store(int maxSize) {
        itemInStore = new DigitalVideoDisc[maxSize];
        numberOfItems = 0;
    }
    //Add DVDs
    public void addDVD(DigitalVideoDisc dvd) {
        if (numberOfItems < itemInStore.length) {
            itemInStore[numberOfItems] = dvd;
            numberOfItems++;
            System.out.println(dvd.getTitle() + " has been added!");
        } else {
            System.out.println("Cannot add more DVD!");
        }
    }
    //Remove DVDs
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean check = false; //Check if DVD already exists
        for (int i = 0; i < numberOfItems; i++) {
            if (itemInStore[i].equals(dvd)) {
                check = true;
                for (int j = i; j < numberOfItems - 1; j++) {
                    itemInStore[j] = itemInStore[j + 1];
                }
                numberOfItems--;
                System.out.println(dvd.getTitle() + " has been removed!");
                break;
            }
        }
        if (!check) System.out.println(dvd.getTitle() + " not found!");
    }
    //Display store interface
    public void displayStore() {
        System.out.println("**********DVD STORE**********");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println(itemInStore[i].toString());
        }
        System.out.println("***************************");
    }
}
