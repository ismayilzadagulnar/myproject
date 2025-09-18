//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle(6, 3, 4);
        Figure rectangle = new Rectangle(6, 10);
        Figure circle = new Circle(5, 3.14);

        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());

        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " +  circle.perimeter());

        }
    }
