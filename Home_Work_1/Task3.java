public class Task3 {
    public static void main(String[] args) {
        printString("abcd", 5); // abcdabcdabcdabcdabcd
    }
    private static void printString(String source, int repeat) {
        System.out.println(source.repeat(repeat));
    }
}