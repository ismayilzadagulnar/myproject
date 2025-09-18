//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("Telephone", 3000,1);
        Clothing clothing = new Clothing("Tshirt", 50, "L");

        electronics.showInfo();
        System.out.println("Endirimli qiymet: " + electronics.calculateDiscountPrice());

        System.out.println("------------------------------------------");

        clothing.showInfo();
        System.out.println("Endirimli qiymet: " + clothing.calculateDiscountPrice());
    }
}