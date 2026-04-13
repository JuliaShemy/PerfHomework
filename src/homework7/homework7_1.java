package homework7;
/*
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
 */
public class homework7_1 {
    public static String findShortestString(String str1, String str2, String str3) {
        String min = str1;
        if (str2.length() < min.length()) {
            min = str2;
        }
        if (str3.length() < min.length()) {
            min = str3;
        }
        System.out.println("Самая короткая строка: " + min + " , её длина равна: " + min.length());
        return min;
    }

    public static String findlongestString(String str1, String str2, String str3) {
        String max = str1;
        if (str2.length() > max.length()) {
            max = str2;
        }
        if (str3.length() > max.length()) {
            max = str3;
        }
        System.out.println("Самая длинная строка: " + max + " , её длина равна: " + max.length());
        return max;
    }

}
