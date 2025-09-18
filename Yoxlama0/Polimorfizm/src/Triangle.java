 public class Triangle extends Figure {
    int base;
    int height;
    int side;

    public Triangle(int base, int height, int side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double area() {
        return 0.5 * base * height;
    }

    public double perimeter() {
        return base + 2 * side;
    }
}
