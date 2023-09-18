import java.io.CharArrayReader;

public class CharArrayReaderExample {
    public static void main(String[] args) {
        char[] data = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 't', 'e', 's', 't'};
        try {
            // Creates a CharArrayReader
            CharArrayReader input = new CharArrayReader(data);

            // Reads the first character
            int character = input.read();

            // Prints the character
            System.out.println((char) character);

            // Closes the reader
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
