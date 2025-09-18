import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int f = 10;
       long faktorial = 1; // overflow problemine gore long yaziriq ki sehv netice vermesin
        for (int i = 1; i <= f ; i++) {
            faktorial *= i;
        }
        System.out.println(f + " Ededinin faktoriali: " + faktorial);
        }
    }