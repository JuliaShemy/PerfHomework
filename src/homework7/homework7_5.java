package homework7;

/*
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
 */
public class homework7_5 {
    public static void printStringDoubleSymbol(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char a = string.charAt(i);
            result.append(a).append(a);
        }
        System.out.println("Задублированная строка: " + result);
    }
}