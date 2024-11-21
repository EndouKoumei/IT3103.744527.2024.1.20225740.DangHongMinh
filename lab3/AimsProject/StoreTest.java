//Dang Hong Minh - 20225740
package lab3.AimsProject;
public class StoreTest {
    public static void main(String[] args) {
        //Create new store with a 5 DVDs max and add DVD to the store
        Store store = new Store(5);
        //Create some DVDs to add to the store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Tabi no Tochuu",
        "Music", "Natsumi Kiyoura", 5, 17.44f);
        store.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("See Tinh",
        "Music", "Hoang Thuy Linh", 6, 16.99f);
        store.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Shake it Off",
        "Music", "Taylor Swift", 4, 20.23f);
        store.addDVD(dvd3);
        //Display the current state of the store
        store.displayStore();
        //Remove a DVD from the store (success)
        store.removeDVD(dvd2);
        // Remove failed
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter",
        "Fiction", 18.99f);
        store.removeDVD(dvd4);
        //Display the updated store
        store.displayStore();
    }
}