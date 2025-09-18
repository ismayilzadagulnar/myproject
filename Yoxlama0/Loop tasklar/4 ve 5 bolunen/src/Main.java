//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 15; i <= 25; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println("4-e ve 5-e bolunen ilk eded: " + i);
                break;
            }
        }
    }
}