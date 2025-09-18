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
        String gunAdi = "";
        if (yeniGun == 0) {
            gunAdi = "Bazar";
        } else if (yeniGun == 1) {
            gunAdi = "Bazar ertesi";
        } else if (yeniGun == 2) {
            gunAdi = "Cersenbe axsami";
        } else if (yeniGun == 3) {
            gunAdi = "Cersenbe";
        } else if (yeniGun == 4) {
            gunAdi = "Cume axsami";
        } else if (yeniGun == 5) {
            gunAdi = "Cume";
        } else if (yeniGun == 6) {
            gunAdi = "Senbe";
        } else {
            gunAdi = "yanlis gun";
        }
        System.out.println(n + " gun sonra heftenin gunu: " + gunAdi);
    }
}