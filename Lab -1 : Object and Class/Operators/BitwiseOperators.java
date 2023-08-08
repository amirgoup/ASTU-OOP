public class BitwiseOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Bitwise AND
        int result1 = num1 & num2;
        System.out.println("num1 & num2 = " + result1);

        // Bitwise OR
        int result2 = num1 | num2;
        System.out.println("num1 | num2 = " + result2);

        // Bitwise XOR
        int result3 = num1 ^ num2;
        System.out.println("num1 ^ num2 = " + result3);

        // Bitwise Complement
        int result4 = ~num1;
        System.out.println("~num1 = " + result4);

        // Left Shift
        int result5 = num1 << 1;
        System.out.println("num1 << 1 = " + result5);

        // Right Shift
        int result6 = num1 >> 1;
        System.out.println("num1 >> 1  = " + result6);

        // Unsigned Right Shift
        int result7 = num1 >>> 1;
        System.out.println("num1 >>> 1 = " + result7);
    }
}
