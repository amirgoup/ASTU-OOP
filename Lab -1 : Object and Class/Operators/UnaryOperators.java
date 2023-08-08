import java.util.Scanner;

public class UnaryOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number and read the input
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Print the value of num
        System.out.println("num = " + num);

        // Use the unary operator ++ to increment the value of num by 1 and print the new value
        num++;
        System.out.println("num++ = " + num);

        // Use the unary operator ++ to increment the value of num by 1 again and print the new value
        ++num;
        System.out.println("++num = " + num);

        // Use the unary operator -- to decrement the value of num by 1 and print the new value
        num--;
        System.out.println("num-- = " + num);

        // Use the unary operator -- to decrement the value of num by 1 again and print the new value
        --num;
        System.out.println("--num = " + num);
    }
}
