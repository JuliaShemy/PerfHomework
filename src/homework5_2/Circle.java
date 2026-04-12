package homework5_2;

public class Circle extends Figure {
 double r; //радиус круга

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;// площадь круга = Пи * радиус в квадрате
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * r; //длина окружности = 2Пи * радиус
    }
}