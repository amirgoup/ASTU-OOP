import java.util.Scanner;

public class TernaryOperator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int num1 = input.nextInt();
    System.out.println("Enter the second number:");
    int num2 = input.nextInt();
    System.out.println("Enter the third number:");
    int num3 = input.nextInt();

    int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
    System.out.println("The largest number is " + max);
  }
}
