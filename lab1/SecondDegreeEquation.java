//Dang Hong Minh - 20225740
import javax.swing.JOptionPane;
public class SecondDegreeEquation {
    public static void main(String[] args) {
        String strNotification = "The equation is: ";
        //Get value 'a' from the user
        String inputA = JOptionPane.showInputDialog("Enter the value a:");
        double a = Double.parseDouble(inputA);
        if (a == 0) { //If a = 0, not a quadratic equation
            JOptionPane.showMessageDialog(null, "This is not a quadratic equation (a = 0).");
            return;
        }
        strNotification += a + "x^2 + ";
        //Get value 'b' from the user
        String inputB = JOptionPane.showInputDialog("Enter the value b:");
        double b = Double.parseDouble(inputB);
        strNotification += b + "x + ";
        //Get value 'c' from the user
        String inputC = JOptionPane.showInputDialog("Enter the value c:");
        double c = Double.parseDouble(inputC);
        strNotification += c + " = 0";
        //Calculate delta = b^2 - 4ac
        double delta = b * b - 4 * a * c;
        //Check delta
        if (delta > 0) { //Two distinct solutions
            JOptionPane.showMessageDialog(null, strNotification, "Your input", JOptionPane.INFORMATION_MESSAGE);
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "The equation has two distinct solutions:\nx1 = " + x1 + "\nx2 = " + x2,
            "Two distinct solutions!", JOptionPane.INFORMATION_MESSAGE);
        } else if (delta == 0) { //One double solutions
            JOptionPane.showMessageDialog(null, strNotification, "Your input", JOptionPane.INFORMATION_MESSAGE);
            double x = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "The equation has one double solutions:\nx = " + x,
            "One double solutions!", JOptionPane.INFORMATION_MESSAGE);
        } else { //No real solutions
            JOptionPane.showMessageDialog(null, strNotification, "Your input", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "The equation has no real solutions.",
            "No real solutions!", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}