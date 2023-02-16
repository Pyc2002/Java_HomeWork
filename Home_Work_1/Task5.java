// Задать целочисленный массив, состоящий из элементов 0 и 1.
//  * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
import java.util.Arrays;

public class Task5 {
    
    public static void main(String[] args) {
        
        int[] array = new int [] {0, 0, 1, 0, 1, 1};
        for (int i = 0; i < array.length; i++) 
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
        System.out.println(Arrays.toString(array));
        }
      
    }



    


