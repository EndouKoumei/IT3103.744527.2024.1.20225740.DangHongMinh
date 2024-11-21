//Dang Hong Minh - 20225740
import javax.swing.JOptionPane;
public class FirstDegreeSystem {
    public static void main(String[] args) {
        //Get values from the user
        String inputa11 = JOptionPane.showInputDialog("Enter a_11:");
        double a11 = Double.parseDouble(inputa11);
        String inputa12 = JOptionPane.showInputDialog("Enter a_12:");
        double a12 = Double.parseDouble(inputa12);
        String inputb1 = JOptionPane.showInputDialog("Enter b_1:");
        double b1 = Double.parseDouble(inputb1);
        String inputa21 = JOptionPane.showInputDialog("Enter a_21:");
        double a21 = Double.parseDouble(inputa21);
        String inputa22 = JOptionPane.showInputDialog("Enter a_22:");
        double a22 = Double.parseDouble(inputa22);
        String inputb2 = JOptionPane.showInputDialog("Enter b_2:");
        double b2 = Double.parseDouble(inputb2);
        //Calculate the determinants
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        //Check for solution
        if (D != 0) { //Unique solution
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "Unique solution:\nx_1 = " + x1 + "\nx_2 = " + x2, "Unique Solution!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (D1 == 0 && D2 == 0) { //Infinitely many solutions
                JOptionPane.showMessageDialog(null, "The system has infinite solutions.", "Infinite Solution!", JOptionPane.INFORMATION_MESSAGE);
            } else { //No solution
                JOptionPane.showMessageDialog(null, "The system has no solution.", "No Solution!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.exit(0);
    }
}