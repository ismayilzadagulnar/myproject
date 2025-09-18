import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Heftenin gununu reqemle daxil et (0-Bazar, 1-Bazar ertesi, ..., 6-Senbe): ");
        int cariGun = sc.nextInt();
        System.out.println("Uzerine nece gun gelmek isteyirsen?: ");
        int n = sc.nextInt();
        int yeniGun = (cariGun + n) % 7;
        System.out.println(n + " gun sonra heftenin gunu: ");
        switch (yeniGun) {
            case 0:
                System.out.println("Bazar");
                break;
            case 1:
                System.out.println("Bazar ertesi");
                break;
            case 2:
                System.out.println("Cersenbe axsami");
                break;
            case 3:
                System.out.println("Cersenbe");
                break;
            case 4:
                System.out.println("Cume axsami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Senbe");
                break;
            default:
                System.out.println("yanlis gun");
        }
    }
}