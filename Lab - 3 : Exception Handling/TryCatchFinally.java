public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            // code that might generate an exception
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            // code to handle the exception
            System.out.println("ArithmeticException => " + e.getMessage());
        } finally {
            // code that will always be executed
            System.out.println("Finally block is always executed");
        }
    }
}
