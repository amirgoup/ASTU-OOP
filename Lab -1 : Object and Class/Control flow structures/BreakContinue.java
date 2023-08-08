public class BreakContinue {
    public static void main(String[] args) {
        int i = 0;

        while (i < 5) {
            if (i == 3) {
                System.out.println("Found number 3 at index " + i);
                break;
            }
            System.out.println("Number " + i);
            i++;
        }

        int j = 0;

        while (j < 5) {
            if (j == 3) {
                System.out.println("Skipping number 3 at index " + j);
                j++;
                continue;
            }
            System.out.println("Number " + j);
            j++;
        }
    }
}
