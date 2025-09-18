import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin: ");
        int eded = sc.nextInt();
        int original = eded;
        int ters = 0;
        while (eded != 0)   {
        int qaliq = eded % 10;
        ters = ters * 10 + qaliq;
        eded = eded / 10;
        }

        if ( original == ters) {
            System.out.println("Daxil edilen eded palindromdur. ");
        } else {
            System.out.println("Daxil edilen eded palindrom deyil. ");
        }
    }
}