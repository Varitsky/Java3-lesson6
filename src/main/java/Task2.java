public class Task2 {

    /**
     * Непонятно почему данный метод (и метод task1) должен быть статичным,
     * хотя на уровке калькулятор был без статики.
     * Почему?
     *     *при запуске теста вызов метода подчеркивается красным и просит сделать его статичным
     */
    public int[] arr;

    public static boolean arrayOfOneAndFour(int[] arr) {
        boolean one = false, four = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) one = true;
            else if (arr[i] == 4) four = true;
            else return false;
        }
        return one && four;
    }
}