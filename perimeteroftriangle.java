import java.util.*;

public class perimeteroftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        float a = sc.nextFloat();

        System.out.print("Enter second side: ");
        float b = sc.nextFloat();
         
         System.out.print("Enter third side: ");
        float c = sc.nextFloat();

        float area = a+b+c;

        System.out.println("Area of triangle = " + area);

    }
}
