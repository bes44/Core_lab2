package arrayDifference;

/**
 * Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
 */


public class ArrayDifference {

    public static double findDifference(Object[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        for (Object obj : array) {
            if (obj instanceof Number) {
                double num = ((Number) obj).doubleValue();
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } else {
                throw new IllegalArgumentException("Все элементы массива должны быть числами");
            }
        }

        System.out.println("Разница между макс и мин элементами в массиве: " + java.util.Arrays.toString(array));
        return max - min;
    }

    public static void main(String[] args) {
        Object[] array1 = {2, 1.5, 5, 3.2, 4};
        Object[] array2 = {10, 20.0, 30, 40, 50.5};
        Object[] array3 = {-10, -20.5, -30, -40, -50};
        Object[] array4 = {};
        Object[] mixedArray = {1, "string", 3.5};

        try {
            System.out.println(findDifference(array1));
            System.out.println(findDifference(array2));
            System.out.println(findDifference(array3));
            System.out.println(findDifference(array4));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            System.out.println("Разница между макс и мин элементами в mixedArray: " + findDifference(mixedArray));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}



