// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

package Home_Work_3;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++){
            list.add(rand.nextInt(100)); 
        }
        System.out.println(list);
        int sum = 0;
        for (Integer item : list) {
            sum += item;
        }
        System.out.println("Минимальное число: " + Collections.min(list));
        System.out.println("Максимальное число: " + Collections.max(list));
        System.out.println("Среднее арифметическое: " + (double) sum/list.size());
       
        // Второй способ:
        // Collections.sort(list);
        // System.out.println(list.get(0));
        // System.out.println(list.get(list.size() - 1));
    }
}
