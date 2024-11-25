package countEvens;

/**
 * Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3
 * countEvens([2, 2, 0]) → 3
 * countEvens([1, 3, 5]) → 0
 */


public class CountEvens {
    public static int countEvens(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};

        System.out.println("Количество четных элементов в array1: " + countEvens(array1));
        System.out.println("Количество четных элементов в array2: " + countEvens(array2));
        System.out.println("Количество четных элементов в array3: " + countEvens(array3));
    }
}
