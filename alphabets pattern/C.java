public class C {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                // Top and Bottom line
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            } else {
                // Side line
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}