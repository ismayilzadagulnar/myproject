public class Circle extends Figure {
    int radius;
    double PI;

    public Circle(int radius, double PI) {
        this.radius = radius;
        this.PI = PI;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
