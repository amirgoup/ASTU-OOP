import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("file1.txt");
            FileInputStream fis2 = new FileInputStream("file2.txt");
            SequenceInputStream sequence = new SequenceInputStream(fis1, fis2);
            int i;
            while ((i = sequence.read()) != -1) {
                System.out.print((char) i);
            }
            sequence.close();
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }
}
