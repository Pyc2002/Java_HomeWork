// Реализовать консольное приложение, которое принимает от пользователя строку вида  text~num

// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.


package Home_Work_4;
import java.util.ArrayList;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        
        
        ArrayList<String> arr = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        String str = "";
        System.out.println("Для выхода наберите exit");
        
        
        while (!str.equals("exit")){
            System.out.println("");
            System.out.println("Для вывода строки наберите print~number");
            System.out.println("Введите строку вида 'text~number' без пробелов: ");
            try {
                str = iScanner.nextLine();
                String[] split = str.split("~");
                String word = split[0];
                String numberString = split[1];
                int number = Integer.parseInt(numberString);
                if (!str.equals("print~" + numberString)){
                    if (arr.size()==0){
                        for (int i = 0; i < number+1; i++) {
                            arr.add(null);
                        }
                    }

                    if (arr.size()<=number) {    // чтобы не добавлял лишние элементы в список
                        for (int i = arr.size(); i < (number+1); i++) {
                            arr.add(null);
                        }
                    }
                    arr.set(number, word);
                    System.out.println(arr); // для проверки
                }

                if (str.equals("print~" + numberString)){
                // System.out.println(arr.remove(number)); // при выполнении остальные элементы смещаются
                    System.out.println("Ваша строка: "+arr.get(number)); 
                    arr.set(number, null);
                    System.out.println(arr); // для проверки
                }
            } 
            catch (Exception e) {
                if (!str.equals("exit"))System.out.println("Введено не число");
                
            }
        }
        iScanner.close();
    }
}
