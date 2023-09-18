import java.io.FileReader;
import java.io.BufferedReader;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            // Creates a FileReader
            FileReader file = new FileReader("input.txt");

            // Creates a BufferedReader
            BufferedReader input = new BufferedReader(file);

            // Reads the first line of text
            String line = input.readLine();

            // Prints the line of text
            System.out.println(line);

            // Closes the reader
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
