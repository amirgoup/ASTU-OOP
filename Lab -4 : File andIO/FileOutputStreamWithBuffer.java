import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileOutputStreamWithBuffer {
    public static void main(String[] args) {
        String data = "This is a line of text inside the file.";
        try {
            FileOutputStream output = new FileOutputStream("output.txt");
            BufferedOutputStream buffer = new BufferedOutputStream(output);
            byte[] array = data.getBytes();
            buffer.write(array);
            buffer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
