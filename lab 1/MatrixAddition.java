//Dang Hong Minh -20225470
import javax.swing.JOptionPane;
import java.util.Arrays;
public class MatrixAddition {
    public static void main(String[] args) {
        //Get matrix dimensions from the user
        String inputRows = JOptionPane.showInputDialog("Enter the number of rows for the matrices:");
        String inputColumns = JOptionPane.showInputDialog("Enter the number of columns for the matrices:");
        int rows = Integer.parseInt(inputRows);
        int columns = Integer.parseInt(inputColumns);
        //Initialize two matrices
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        //Get user input for the first matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                String element = JOptionPane.showInputDialog("Enter element for matrix 1 at[" + (i + 1) + "][" + (j + 1) + "]:");
                matrix1[i][j] = Integer.parseInt(element);
            }
        }
        //Get user input for the second matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                String element = JOptionPane.showInputDialog("Enter element for matrix 2 at [" + (i + 1) + "][" + (j + 1) + "]:");
                matrix2[i][j] = Integer.parseInt(element);
            }
        }
        //Create the result matrix for storing the sum
        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        //Convert the result matrix to a string for display
        StringBuilder resultString = new StringBuilder("Result Matrix (Sum):\n");
        for (int[] row : resultMatrix) {
            resultString.append(Arrays.toString(row)).append("\n");
        }
        //Display the result matrix
        JOptionPane.showMessageDialog(null, resultString.toString(), "Matrix Addition Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}