package homework7;
/*
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
 */
public class homework7_3 {
    public static void shorterThanAverage(String str1, String str2, String str3) {
        int avg = (str1.length() + str2.length() + str3.length()) / 3;
        System.out.println("Средняя длинна строки равна: " + avg);

        if (str1.length() < avg) {
            System.out.println("Длина строки " + str1 + " короче средней, равна " + str1.length());
        }
        if (str2.length() < avg) {
            System.out.println("Длина строки " + str2 + " короче средней, равна " + str2.length());
        }
        if (str3.length() < avg) {
            System.out.println("Длина строки " + str3 + " короче средней, равна " + str3.length());
    }
}}