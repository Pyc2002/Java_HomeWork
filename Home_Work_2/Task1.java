 // 1. Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш
package Home_Work_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово:");
        String word = in.next();
        System.out.println(ifPalindrom(word));
        in.close();
    }
    public static boolean ifPalindrom(String args) {
        String temp = new StringBuilder(args).reverse().toString();
        if (args.equalsIgnoreCase(temp)) return true;
        else return false;
    }
        

    // public static boolean ifPalindrom(String args) {
    //     for (int i = 0; i < args.length()/2; ++i) {
    //         if (args.charAt(i) = args.charAt(args.length() - i - 1)) {
    //             return true;
    //                 }
    //             }
    //         return false;
    // }


    // public static boolean ifPalindrom(String args) {
    //     for (int i = 0, j = args.length() - 1; i < j; i++, j--)
    //     {
    //         if (args.charAt(i) != args.charAt(j)) {
    //             return false;
    //         }
    //     }
 
    //     return true;
    // }
}