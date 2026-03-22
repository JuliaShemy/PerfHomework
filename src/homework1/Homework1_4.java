package homework1;

/*
В переменной n хранится вещественное число с ненулевой дробной частью.
Создайте программу, которая округляет число n до ближайшего целого и
выводящую результат на экран.
 */
public class Homework1_4 {
    public static void main(String[] args) {
        double n = 1.76;
        int a = (int) Math.round(n);

        System.out.println(a);
    }
}
