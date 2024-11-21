import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] weights = new int[]{90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
//        weights[0] = 90;
//        int januaryWeigh = weights[0];
//        System.out.println(januaryWeigh);
//        System.out.println(weights[0]);
//        System.out.println(weights[4]);
//        int january = 0;
//        System.out.println(weights[january]);
//        for (int i = 0; i < weights.length; i++) {
//            System.out.println(weights[i]);
//        }
//        int[] arr = new int[10];
//        System.out.println(Arrays.toString(arr));
//        for (int index = 0; index < arr.length; index++) {
//            if (index == arr.length - 1) {
//                System.out.println(arr[index]);
//                break;
//            }
//            System.out.print(arr[index] + " ");
//        }
//        Задача 1 + 2
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.println(Arrays.toString(number));
        double[] number2 = {1.57D, 7.654D, 9.986D};
       System.out.println(Arrays.toString(number2));
        boolean[] number3 = {100 > 99, 50 > 54};
       System.out.println(Arrays.toString(number3));
//        Задача 3
        number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        int i;
        for (i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        number2 = new double[]{1.57D, 7.654D, 9.986D};
        for (i = number2.length - 1; i >= 0; i--) {
            System.out.print(number2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        number3 = new boolean[]{100 > 99, 50 > 54};
        for (i = number3.length - 1; i >= 0; i--) {
            System.out.print(number3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
//        Задача 4
        number = new int[]{1, 2, 3};
        for (i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] += 1;
            }
            System.out.print(number[i] + " ");
        }
    }
}




