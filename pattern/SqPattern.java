import java.util.Scanner;

public class SqPattern {

    // Function to print square pattern
    static void printSquare(int n) {
        for(int i = 1; i <= n; i++) {        // rows
            for(int j = 1; j <= n; j++) {    // columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        printSquare(n);
    }
}