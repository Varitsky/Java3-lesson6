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
