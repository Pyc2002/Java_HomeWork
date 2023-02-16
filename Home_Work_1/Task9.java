// Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

public class Task9 {
    public static void main(String[] args) {
        
        int[] array = {-7, -5, 150, 42};
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
    }
}