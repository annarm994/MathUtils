public class TestMathUtils {
    public static void main(String[] args) {
        System.out.println("Addition Test: " + MathUtils.add(5, 3));  // 8
        System.out.println("Subtraction Test: " + MathUtils.subtract(5, 3)); // 2
        System.out.println("Multiplication Test: " + MathUtils.multiply(5, 3)); // 15
        System.out.println("Division Test (normal): " + MathUtils.divide(10, 2)); // 5.0
        System.out.println("Division Test (by zero): " + MathUtils.divide(10, 0)); // NaN
    }
}
