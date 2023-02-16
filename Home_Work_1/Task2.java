public class Task2 {
    public static void main(String[] args) {
        System.out.println(isPositive(-5)); // true
    }
    
    private static boolean isPositive(int x) {
        if (x > 0) return true;
        return false;
    }
}
