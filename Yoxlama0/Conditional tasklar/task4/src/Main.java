import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
        System.out.println("Eded cutdur.");
    } else {
            System.out.println("Eded tekdir.");
        }
    }
}