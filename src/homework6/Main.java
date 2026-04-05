package homework6;
/*
Создать класс с как минимум 4 разными методами, в каждом методе добавить
проверку на исключительные ситуации, используя:
1. try- catch
2. try-catch, где catch будет несколько
3. try -catch, с использованием multi - catch
4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Простой try- catch
        try {
            System.out.println("Введите номер заказа:");
            int number = scanner.nextInt();
            System.out.println("Номер заказа: " + number);
        } catch (Exception e) {
            System.out.println("Номер некорректен");
        }

        arrayExemple();
        multiCatchExample();
        finallyExample();

        scanner.close();
    }

    public static void arrayExemple() {
        try {
            int[] array = new int[2];
            array[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс вне массива");
        } catch (Exception e) {
            System.out.println("Другая ошибка");
        }
    }

    public static void multiCatchExample() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Ошибка null  или деление на 0");
        }
    }

    public static void finallyExample() {
        try {
            int[] array = new int[3];
            array[4] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс вне массива");
        } finally {
            System.out.println("Это выполнится всегда");
        }
    }
}
