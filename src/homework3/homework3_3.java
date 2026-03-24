package homework3;
/*
Найти индексы минимального и максимального элементов и вывести в консоль.
 */

import java.util.Random;
import java.util.Scanner;

public class homework3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int t = scanner.nextInt();

        Random random = new Random();
        int[] numbers = new int[t];

        System.out.println("Массив случайных чисел:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(11);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int max = numbers[0];
        int min = numbers[0];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                indexMax = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                indexMin = i;
            }
        }
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Индекс максимального массива: " + indexMax);
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Индекс минимального массива: " + indexMin);
    }
}
