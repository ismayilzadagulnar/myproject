import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin: ");
        double a = input.nextDouble();
        System.out.println("Ikinci ededi daxil edin: ");
        double b = input.nextDouble();
        System.out.println("Emeliyyati daxil edin (*, /, +, - ): ");
        char operation = input.next().charAt(0);
        if (operation == '+') {
            System.out.println("Netice: " + (a + b));
        } else if (operation == '-') {
            System.out.println("Netice: " + (a - b));
        } else if (operation == '*') {
            System.out.println("Netice: " + (a * b));
        } else if (operation == '/') {
            if (b != 0) {         // != beraber deyil demekdir
            System.out.println("Netice: " + (a / b));
        } else {
            System.out.println("Sifira bolmek olmaz!");
        }
    } else {   // bu setir o demekdir ki, istifadeci +, -, *, / isaresinden basqa isare elave etse sistemde yanlis emeliyyat secimi yazacaq
        System.out.println("Yanlis emeliyyat secimi!");

        }
    }
}