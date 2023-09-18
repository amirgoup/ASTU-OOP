import java.io.FileWriter;
import java.io.BufferedWriter;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String data = "This is the data in the output file";
        try {
            // Creates a FileWriter
            FileWriter file = new FileWriter("output.txt");

            // Creates a BufferedWriter
            BufferedWriter output = new BufferedWriter(file);

            // Writes the string to the file
            output.write(data);

            // Closes the writer
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
