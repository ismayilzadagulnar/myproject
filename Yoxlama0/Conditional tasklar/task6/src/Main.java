import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qiymeti daxil edin:");
        int qiymet = sc.nextInt();
        if (qiymet >= 100) {
            System.out.println("Kateqoriya: A");
        } else if (qiymet >= 80) {
            System.out.println("Kateqoriya: B");
        } else if (qiymet >= 60) {
            System.out.println("Kateqoriya: C");
        } else if (qiymet >= 40) {
            System.out.println("Kateqoriya: D");
        } else if (qiymet >= 20) {
            System.out.println("Kateqoriya: E");
        } else if (qiymet >=0) {
            System.out.println("Kateqoriya: F");
        } else {
            System.out.println("Yanlis qiymet daxil edilib! ");
        }
    }
}