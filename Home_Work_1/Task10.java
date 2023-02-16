

public class Task10 {
    public static void main(String[] args) {
        String[] stringArray = {"aaa", "aab", "aa"};
        System.out.println(findCommonPrefix(stringArray)); // aa
        String[] stringArray2 = {"abc", "bca", "cda"};
        System.out.println(findCommonPrefix(stringArray2)); // ""
        String[] stringArray3 = {};
        System.out.println(findCommonPrefix(stringArray3)); // aa
    }

    private static String findCommonPrefix(String [] str) {
        
        if (str.length == 0) return "null";
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix == "") return "-";
            }
        }

        return prefix;
    }

}
