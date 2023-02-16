// Написать метод, принимающий на вход два аргумента: len и initalValue, и возвращающий одномерный массив типа int и длиной len, каждая ячейка которого равна initalValue.
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] res_array = createArray(3, 5);
        System.out.println(Arrays.toString(res_array));
    }

    private static int[] createArray(int len, int initalValue) {
        int[] array = new int [len];
        for (int i = 0; i < len; i++){
            array[i] = initalValue;
        }
        return array;
    }
}
