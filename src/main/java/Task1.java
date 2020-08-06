import java.util.Arrays;
/*
1. Написать метод, которому в качестве аргумента передается не пустой
 одномерный целочисленный массив, метод должен вернуть новый массив,
  который получен путем вытаскивания элементов из исходного массива,
   идущих после последней четверки. Входной массив должен содержать
   хотя бы одну четверку, в противном случае в методе необходимо
   выбросить RuntimeException.
2. Написать набор тестов для этого метода (варианта 3-4 входных данных)
вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ]
 */

public class Task1 {

    public static int[] returnNewArrayAfterLastFour(int[] arr) {
        int index4 = 0;

        boolean four = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                four = true;
                index4 = i;
            }
        }

        if (four==true){
            int[] arr1 = new int[arr.length - index4 - 1];
            System.arraycopy(arr, index4 + 1, arr1, 0, arr1.length);
            return arr1;
        } else {
            throw new RuntimeException("4 не найдена");
        }
    }
}
