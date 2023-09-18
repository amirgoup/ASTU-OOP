import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String data = "This is a text inside the file.";
        try {
            // Creates a FileWriter
            FileWriter file = new FileWriter("output.txt");

            // Creates a PrintWriter
            PrintWriter output = new PrintWriter(file);

            // Writes the string to the file
            output.print(data);

            // Closes the writer
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
