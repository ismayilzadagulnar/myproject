import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("array" + i + "=");
            array[i] = sc.nextInt();
        }
    }
}