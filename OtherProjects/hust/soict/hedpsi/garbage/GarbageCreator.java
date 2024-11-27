//Dang Hong Minh - 20225740
package OtherProjects.hust.soict.hedpsi.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "sample.txt"; // ~ 80KB
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println("Output string length: " + outputString.length());
    }
}
