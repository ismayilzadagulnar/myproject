public class Rectangle extends Figure {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}
