//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hem 2-e hem de 5-e bolunen ededler: "); // yeni 10 bolunenler olmalidir
        for (int i = 30; i <= 90; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}