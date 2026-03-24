package homework1;

/*
Написать программу которая будет менять местами значение целочисленных
переменных.
Пример:
int a = 1;
int b = 2;
 */
public class Homework1_6 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int x = a;
        a = b;
        b = x;

        System.out.println("a = " + a + " " + "b = " + b);
    }
}
