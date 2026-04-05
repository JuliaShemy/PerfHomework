package homework5_2;

/*
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве
 */
public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];//создаем массив из 5 фигур
        figures[0] = new Circle(3);
        figures[1] = new Triangle(2, 3, 5);
        figures[2] = new Rectangle(4, 6);
        figures[3] = new Circle(5);
        figures[4] = new Rectangle(1, 8);

        double sumPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            sumPerimeter += figures[i].perimeter();//считаем периметр для всех фигур массива
        }
        System.out.println("Сумма периметров всех фигур: " + sumPerimeter);
    }
}