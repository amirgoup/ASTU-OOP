/*This Java code is an example of a program that takes user input for a score and then assigns a letter grade based on the score. 
The program uses if-else statements to check the value of the score and then assigns the appropriate letter grade.*/
import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your score: ");
    int score = input.nextInt();
    char grade;
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println("Your grade is " + grade);
  }
}
