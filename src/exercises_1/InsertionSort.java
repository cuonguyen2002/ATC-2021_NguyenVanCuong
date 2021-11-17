package exercises_1;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {30, 49, 25, 81, 64, 10, 43, 75};

        int arrayLength = array.length;

        insertionSort(array, arrayLength);
        showResult(array, arrayLength);
    }

    private static void showResult(int[] array, int arrayLength) {
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void insertionSort(int[] array, int length) {
        for (int i = 1; i < length; i++) {
            int currentValue = array[i];
            int preIndex = i - 1;

            while (preIndex >= 0 && array[preIndex] > currentValue) {
                array[preIndex + 1] = array[preIndex];
                preIndex -= 1;
            }

            array[preIndex + 1] = currentValue;
        }
    }
}
