package homework1;

/*
В переменной n хранится двузначное число. Создайте программу,
вычисляющую и выводящую на экран сумму цифр n. Например: n = 26, в
результате мы должны получить 8 (2 + 6).
 */
public class Homework1_2 {
    public static void main(String[] args) {

        int n = 26;
        int a = n / 10 + n % 10;

        System.out.println("Sum=" + a);
    }
}
