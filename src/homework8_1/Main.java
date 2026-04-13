package homework8_1;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел в виде одной строки через запятую");
        String input = scanner.nextLine();

        String[] array = input.split(",");//делим строку по запятой и сохраняем в массив

        LinkedHashSet<String> set = new LinkedHashSet<>();//создаем коллекцию, которая не допускает повторов

        for (int i = 0; i < array.length; i++) {
            String a = array[i].trim();
            set.add(a);//добавляем эдемент a в коллекцию set
        }
        System.out.println("Без повторяющихся элементов: " + String.join(", ", set));
    }
}