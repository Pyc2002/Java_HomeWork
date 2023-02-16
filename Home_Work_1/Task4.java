public class Task4 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1953));
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) return true;
        else return false;
    }
}
