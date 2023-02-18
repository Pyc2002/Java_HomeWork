// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

package Home_Work_3;
import java.util.Random;
import java.util.ArrayList;



public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++){
            list.add(rand.nextInt(100)); 
        }
        System.out.println(list);
        
        list.removeIf(value -> value %2 == 0);
        System.out.println(list);
    }
}