import java.util.Arrays;

public class ArrayDemo {
  public static void main(String[] args) {
    // create an array of integers
    int[] numbers = { 1, 2, 3, 4, 5 };

    // print the length of the array
    System.out.println("Length of the array: " + numbers.length);

    // print all the elements of the array using a loop statement
    System.out.print("Elements of the array: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();

    // sort the array in ascending order
    Arrays.sort(numbers);
    System.out.println("Sorted elements of the array: " + Arrays.toString(numbers));

    // fill the array with a specific value
    Arrays.fill(numbers, 0);
    System.out.println("Elements of the array after filling with 0: " + Arrays.toString(numbers));
  }
}
