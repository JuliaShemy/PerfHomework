package homework3;

import java.util.Scanner;

public class homework3_2 {
    /*пользователь с клавиатуры вводит размер массива (просто целое число). После того,
    как размер массива задан, заполнить его одним из двух способов: используя Math.random(), или
    каждый элемент массива вводится пользователем вручную.
    Найти минимальный - максимальный элементы и вывести в консоль.
         */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int t = scanner.nextInt();

        int[] numbers = new int[t];

        System.out.println("Введите " + t + " чисел для массива через пробел:");
        for (int i = 0; i < t; i++) {
            numbers[i] = scanner.nextInt();

        }
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Минимальное значение массива: " + min);
    }
}