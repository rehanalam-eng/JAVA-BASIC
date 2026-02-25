import java.util.Scanner;

public class calculator {

    // Addition function
    static int add(int a, int b) {
        return a + b;
    }

    // Subtraction function
    static int sub(int a, int b) {
        return a - b;
    }

    // Multiplication function
    static int mul(int a, int b) {
        return a * b;
    }

    // Division function
    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int x = sc.nextInt();

        System.out.println("Enter second number:");
        int y = sc.nextInt();

        System.out.println("Addition = " + add(x, y));
        System.out.println("Subtraction = " + sub(x, y));
        System.out.println("Multiplication = " + mul(x, y));

        if(y != 0)
            System.out.println("Division = " + div(x, y));
        else
            System.out.println("Division not possible (divide by zero)");
    }
}