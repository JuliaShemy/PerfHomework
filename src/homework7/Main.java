package homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввдите первую строку");
        String str1 = scanner.nextLine();
        System.out.println("Ввдите вторую строку");
        String str2 = scanner.nextLine();
        System.out.println("Ввдите третью строку");
        String str3 = scanner.nextLine();

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());
// найти самую короткую и самую длинную строки.Вывести найденные строки и их длину.
        homework7_1.findShortestString(str1, str2, str3);
        homework7_1.findlongestString(str1, str2, str3);

// Упорядочить и вывести строки в порядке возрастания значений их длины.
        homework7_2.sortByLength(str1, str2, str3);

//Вывести на консоль те строки, длина которых меньше средней, а также их длину
        homework7_3.shorterThanAverage(str1, str2, str3);

//Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
        homework7_4.findFirstUniqueWord(str1, str2, str3);

//Вывести на консоль новую строку, которой задублирована каждая буква из
//начальной строки. Например, "Hello" -> "HHeelllloo"
        homework7_5.printStringDoubleSymbol(str1);
    }
}