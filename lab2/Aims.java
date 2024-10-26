//Dang Hong Minh - 20225740
package lab2;
import java.util.Scanner;
public class Aims {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        while (true) {
            System.out.println("\nAIMS Store Menu:");
            System.out.println("1. Add a DVD to Cart");
            System.out.println("2. Remove a DVD from Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Calculate Total Cost");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter DVD title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter DVD category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter DVD cost: ");
                    float cost = scanner.nextFloat();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter DVD director: ");
                    String director = scanner.nextLine();
                    System.out.print("Enter DVD length: ");
                    int length = scanner.nextInt();

                    DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, cost, director, length);
                    cart.addDVD(dvd);
                    System.out.println("DVD added to cart.");
                    break;

                case 2:
                    System.out.print("Enter the title of DVD to remove: ");
                    String removeTitle = scanner.nextLine();
                    cart.removeDVD(removeTitle);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    System.out.printf("Total cost of DVDs in cart: $%.2f%n", cart.calculateTotalCost());
                    break;

                case 5:
                    System.out.println("Exiting AIMS Store. Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}