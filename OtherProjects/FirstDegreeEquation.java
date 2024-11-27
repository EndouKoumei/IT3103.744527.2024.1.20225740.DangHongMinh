//Dang Hong Minh - 20225740
import javax.swing.JOptionPane;
public class FirstDegreeEquation {
    public static void main(String[] args) {
        String strNotification = "The equation is: ";
        //Get value 'a' from the user
        String inputA = JOptionPane.showInputDialog(null, "Enter the value a:", "Input a",
        JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(inputA);
        strNotification += a + "x + ";
        //Get value 'b' from the user
        String inputB = JOptionPane.showInputDialog(null, "Enter the value b:", "Input b",
        JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(inputB);
        strNotification += b + " = 0";
        //Check if 'a' is zero
        if (a == 0) { //Special cases when a is zero
            if (b == 0) { //Special cases when b is zero
                JOptionPane.showMessageDialog(null, strNotification, "Your input", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "The equation has infinite solutions.", "Infinite Solution!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, strNotification, "Your input", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "The equation has no solution.", "No Solution!", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            //Solve the equation
            double solution = -b / a;
            JOptionPane.showMessageDialog(null, strNotification, "Your input", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "The solution is x = " + solution, "Solution", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
