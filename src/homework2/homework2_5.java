package homework2;

import java.util.Scanner;

/*
 Напишите программу, где пользователь вводит любое целое положительное
число. А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные
  */
public class homework2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        double a = scanner.nextDouble();

        if (a <= 0 || a % 1 != 0) {
            System.out.println("Введено некорректное число");
        } else {
            int sum = 0;
            for (int i = 1; i <= a; i++) {
                sum += i;
            }

            System.out.print("Сумма цифр от 1 до введенного числа = " + sum);


        }
    }
}