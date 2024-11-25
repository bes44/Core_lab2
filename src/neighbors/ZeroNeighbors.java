package neighbors;

/**
 * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */


public class ZeroNeighbors {
    public static boolean hasZeroNeighbors(Object[] array) {
        if (array == null || array.length < 2) {
            return false;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] instanceof Number && array[i + 1] instanceof Number) {
                if (((Number) array[i]).doubleValue() == 0 && ((Number) array[i + 1]).doubleValue() == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Object[] array1 = {1, 0, 0.0, 2, 3};
        Object[] array2 = {4, 5, "string", 6, 0};
        Object[] array3 = {7, null, 9, 0, 0};

        System.out.println("Массив содержит два нуля соседа: " + hasZeroNeighbors(array1));
        System.out.println("Массив содержит два нуля соседа: " + hasZeroNeighbors(array2));
        System.out.println("Массив содержит два нуля соседа: " + hasZeroNeighbors(array3));
    }
}
