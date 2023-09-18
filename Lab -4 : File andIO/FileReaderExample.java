import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String data = "This is the data in the output file";
        try {
            // Creates a FileReader
            FileReader output = new FileReader("output.txt");

            // Writes the string to the file
            output.write(data);

            // Closes the writer
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
