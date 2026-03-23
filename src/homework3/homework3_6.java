package homework3;

import java.util.Scanner;

/*
Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
 */
public class homework3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int t = scanner.nextInt();

        int[] numbers = new int[t];

        System.out.println("Введите " + t + " чисел для массива через пробел:");
        for (int i = 0; i < t; i++) {
            numbers[i] = scanner.nextInt();
        }
        boolean x = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("Возрастающая последовательность");
        } else {
            System.out.println("НЕ Возрастающая последовательность");
        }
    }
}