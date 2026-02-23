public class Temperature {

    static float convert(float c) {
        return (c * 9/5) + 32;
    }

    public static void main(String[] args) {
        System.out.println("Fahrenheit = " + convert(25));
    }
}