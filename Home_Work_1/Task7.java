// 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
//  * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
  
    int len = 6;
    int[][] array = new int[len][len];
    for (int i = 0; i < len; i++) {
        for (int j = 0; j < len; j++) {
            if (i==j) array[i][j] = 1;
            else  array[i][j] = 0;
                       
        }
        System.out.println(Arrays.toString(array[i]));
        }
    }
}