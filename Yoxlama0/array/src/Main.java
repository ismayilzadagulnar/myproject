//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int[] ededler = {5, 10, 15, 20};
//        int cem = 0;
//        for (int i = 0; i < ededler.length; i++) {
//            cem += ededler[i];
//        }
//        System.out.println("cem:" + cem);
//        ----------------------------------------------------
//        int[] ededler = {4, 11, 23, 7, 15};
//
//        int max = ededler[0];
//
//        for (int i = 1; i < ededler.length; i++) {
//
//            if (ededler[i] > max) {
//                max= ededler[i];
//            }
//        }
//        System.out.println("En boyuk eded: " + max);
//        ------------------------------------------------------
//        int[][] matris = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//        for (int i = 0; i < matris.length; i++) {
//            for (int j = 0; j < matris[i].length; j++) {
//                System.out.printf(matris[i][j] + " ");
//            }
//            System.out.println();
//
//        }
//        ------------------------------------------------------------
//        int[][] matris = {
//                {2, 4},
//                {6, 8},
//                {10, 12}
//        };
//        int cem = 0;
//        for (int i = 0; i < matris.length; i++) {
//            for (int j = 0; j < matris[i].length; j++) {
//                cem += matris[i][j];
//
//            }
//
//        }
//        System.out.println("Cem:" + cem);
//        ----------------------------------------------
        String[] sozler = {"Java", "Python", "C++"};
        tersCapEt(sozler);

    }

    private static void tersCapEt(String[] arr) {
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }
    }
}
