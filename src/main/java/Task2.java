/*
Написать метод, который проверяет что массив состоит только из чисел
 1 и 4. Если в массиве нет хоть одной 4 или 1, то метод вернет false;
Написать набор тестов для этого метода (варианта 3-4 входных данных)
 */
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