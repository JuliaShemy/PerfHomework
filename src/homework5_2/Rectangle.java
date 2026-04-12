package homework5_2;

public class Rectangle extends Figure{
    double d;//длина
    double s;//ширина

    public Rectangle(double d, double s) {
        this.d = d;
        this.s = s;
    }

    @Override
    public double area() {
        return d * s;//площадь прямоугольника = длинa * ширина
    }

    @Override
    public double perimeter() {
        return (d + s) * 2;//периметр прямоугольника = (длина + ширина) * 2
    }
}
