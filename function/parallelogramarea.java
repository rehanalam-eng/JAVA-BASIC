import java.util.Scanner;

public class parallelogramarea {

    // Function to calculate area
    static void findArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of parallelogram: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of parallelogram: ");
        double height = sc.nextDouble();

        double area = base * height;

        System.out.println("Area of Parallelogram = " + area);
    }

    public static void main(String[] args) {
        findArea();   // Calling function
    }
}