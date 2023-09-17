public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            //outer try block
            try {
                //inner try block 1
                try {
                    //inner try block 2
                    int arr[] = {1, 2, 3, 4};
                    System.out.println(arr[10]);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                }
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
            }
        } catch (Exception e) {
            System.out.println("Handled the exception (outer catch)");
        }
        System.out.println("Normal flow..");
    }
}
