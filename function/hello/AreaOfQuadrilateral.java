import java.util.Scanner;

public class AreaOfQuadrilateral {

    static void areaQuad(double d, double h1, double h2) {
        double area = 0.5 * d * (h1 + h2);
        System.out.println("Area of Quadrilateral = " + area);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diagonal: ");
        double d = sc.nextDouble();

        System.out.print("Enter height1: ");
        double h1 = sc.nextDouble();

        System.out.print("Enter height2: ");
        double h2 = sc.nextDouble();

        areaQuad(d, h1, h2);
    }
}