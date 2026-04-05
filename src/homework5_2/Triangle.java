package homework5_2;

public class Triangle extends Figure{
    double a;//1 сторона треугольника
    double b;//2 сторона треугольника
    double c;//3 сторона треугольника

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2; // полупериметр треугольника
       return Math.sqrt(p * (p - a) * (p - b) * (p - c));// площадь треугольника

    }

    @Override
    public double perimeter() {
        return a + b + c;// периметр треугольника
    }
}
