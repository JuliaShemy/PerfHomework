package homework3;

import java.util.Random;
import java.util.Scanner;

/*
Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
 */
public class homework3_4 {
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

        int zero = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zero++;
            }
        }
        if (zero > 0) {
            System.out.println("Количество нулевых элементов: " + zero);
        } else {
            System.out.println("Нулевых элементов нет");
        }
    }
}