package homework3;

import java.util.Random;
import java.util.Scanner;

/*
пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную.
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
 */
public class homework3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int t = scanner.nextInt();

        Random random = new Random();
        int[] numbers = new int[t];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(11);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");

        }
    }
}