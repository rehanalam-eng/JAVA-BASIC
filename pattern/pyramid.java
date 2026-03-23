public class pyramid {

    // Function to print pyramid
    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(5);
    }
}