package homework7;

/*
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
 */
public class homework7_2 {
    public static void sortByLength(String str1, String str2, String str3) {
        String first = str1;
        String second = str2;
        String third = str3;
        String temp;

        if (first.length() > second.length()) {
            temp = first;
            first = second;
            second = temp;
        }
        if (first.length() > third.length()) {
            temp = first;
            first = third;
            third = temp;
        }
        if (second.length() > third.length()) {
            temp = second;
            second = third;
            third = temp;
        }
        System.out.println("Строки в порядке возрастания длины:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}