//Dang Hong Minh - 20225740
import javax.swing.JOptionPane;
import java.util.Arrays;
public class ArrayDisplay {
    public static void main(String[] args) {
        //Prompt the user to enter the size of the array
        String inputSize = JOptionPane.showInputDialog("Enter the number of elements in the array:");
        int size = Integer.parseInt(inputSize);
        //Initialize the array
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            String inputElement = JOptionPane.showInputDialog("Enter element " + (i + 1) + ":");
            numbers[i] = Integer.parseInt(inputElement);
        }
        Arrays.sort(numbers); //Sort the array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        } //Calculate the sum
        double average = (double) sum / size; //Calculate the average
        //Display the sorted array, sum, and average
        String sortedArray = Arrays.toString(numbers);
        String message = "Sorted Array: " + sortedArray + "\nSum: " + sum + "\nAverage: " + average;
        JOptionPane.showMessageDialog(null, message,
        "Array Display", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
