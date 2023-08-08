public class EscapeSequenceCharacters {
    public static void main(String[] args) {
        // Using escape sequence characters to print "Hello" and "World" with different formatting
        System.out.println("Hello\tWorld"); // \t is used to insert a tab character between "Hello" and "World"
        System.out.println("Hello\nWorld"); // \n is used to insert a newline character after "Hello"
        System.out.println("Hello\rWorld"); // \r is used to insert a carriage return character after "Hello"
        System.out.println("Hello\"World\""); // \" is used to insert a double quote character within the string
        System.out.println("Hello\'World\'"); // \' is used to insert a single quote character within the string
        System.out.println("Hello\\World"); // \\ is used to insert a backslash character within the string
        System.out.println("Hello\bWorld"); // \b is used to insert a backspace character after "Hello"
    }
}
