public class rectangle {
    static void printRectangle(int rows, int cols) {
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Rectangle 5x8:");
        printRectangle(5, 8);
    }
}