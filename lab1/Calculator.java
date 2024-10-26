//Dang Hong Minh - 20225740
//Example 5: Calculator.java
import javax.swing.JOptionPane;
public class Calculator {
    public static void main(String[] args) {
        String strNotification = "You've just entered: ";
        String strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
        JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNotification += strNum1 + " and ";
        String strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
        JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        strNotification += strNum2;
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient;
        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Division by zero!", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String resultMessage = "Sum: " + sum +
        "\nDifference: " + difference +
        "\nProduct: " + product +
        "\nQuotient: " + quotient;
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultMessage, "Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}