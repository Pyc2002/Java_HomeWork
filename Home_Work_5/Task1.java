/*
 * Написать метод, определяющую правильность расстановки скобок в выражении.
 * Могут содержаться следующие скобки: ()[]{}<>
 * () -> true
 * []{}((<>)) -> true
 * ) -> false
 * [) -> false
 * []{}(<)> -> false
 */
package Home_Work_5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку со скобками: ");
            String str = in.nextLine();
            System.out.println(isBrackets(str));
            in.close();
        } catch (Exception e) {
            System.out.println("Введены не скобки");
        }
        // System.out.println(isBrackets("()")); // 1 - true
        // System.out.println(isBrackets("[]{}((<>))")); // 2 - true
        // System.out.println(isBrackets(")")); // 3 - false
        // System.out.println(isBrackets("[)")); // 4 - false
        // System.out.println(isBrackets("[]{}(<)>")); // 5 - false
        
    }
       
    private static boolean isBrackets(String inSymbols) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        map.put('>', '<');
        Deque<Character> list = new LinkedList<>();
        char[] arr = inSymbols.toCharArray();
        for (char item : arr) {
            if (map.containsValue(item)) list.addLast(item);   // проверяем, если это открывающаяся скобка, то добавляем ее в конец list
            else if (map.containsKey(item)) {                    // если это закрывающая скобка ->
                if (list.isEmpty() || list.pollLast() != map.get(item)) {      // то list должен быть не пустым и последней должна быть подходящая скобка -> 
                    return false;                                            // открывающаяся скобка удаляется из list, если попадается закрывающая 
                }
            }
        }
        return list.isEmpty(); // list должен возвращаться пустым, если нет, то будет работать некорректно без парной скобки 
    }
}