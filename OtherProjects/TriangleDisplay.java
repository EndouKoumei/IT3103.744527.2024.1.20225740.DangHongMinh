//Dang Hong Minh - 20225740
import javax.swing.JOptionPane;
public class TriangleDisplay {
    public static void main(String[] args) {
        //Prompt the user to enter the height of the triangle
        String input = JOptionPane.showInputDialog(null, "Enter the height of the triangle:",
        "User input", JOptionPane.INFORMATION_MESSAGE);
        int n = Integer.parseInt(input);
        //Build and display the triangle
        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                triangle.append(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                triangle.append("*");
            }
            triangle.append("\n");
        }
        // Show the triangle in a message dialog
        JOptionPane.showMessageDialog(null, triangle.toString(),
        "Triangle Display", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
