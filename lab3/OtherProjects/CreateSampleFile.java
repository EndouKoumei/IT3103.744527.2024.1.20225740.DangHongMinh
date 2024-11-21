//Dang Hong Minh - 20225740
import java.io.FileOutputStream;
import java.io.IOException;
public class CreateSampleFile {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        int fileSizeKB = 100;
        byte[] data = new byte[1024];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) ('A' + (i % 26));
        }
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for (int i = 0; i < fileSizeKB; i++) {
                fos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}