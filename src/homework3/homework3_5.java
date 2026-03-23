package homework3;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/*
Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
 */
public class homework3_5 {
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

        for (int i = 0; i < t / 2; i++) {
            int x = numbers[i];
            numbers[i] = numbers[t - 1 - i];
            numbers[t - 1 - i] = x;
        }
        System.out.println("Измененный массив: " + Arrays.toString(numbers));
    }
}