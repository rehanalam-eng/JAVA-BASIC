import java.util.*;
public class voteornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of candidate : ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("they can vote");
        }
      else {
        System.out.println("they cannot vote");
      }
    }
}