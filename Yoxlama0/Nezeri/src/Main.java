//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int[] array = new int[100];
//        for (int i = 0; i < array.length; i++) {
//             array[i]= i+1;
//            System.out.println(array[i]);
//            for (int j = 99; j >= 0; j--) {
//                System.out.println(array[j]);
//
//            }
//        }
//        --------------------------
        int[] array = {1, 5, 6, -5, 7};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min= array[i];
                System.out.println("EN KICIK EDED:" + min);


            }

        }
    }

}