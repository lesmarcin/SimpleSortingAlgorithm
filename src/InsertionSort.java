public class InsertionSort {
    public static void InsertionSort(int[] array) {
        for (int i = 1; i<array.length; i++) {
            int current = array[i];
            int index = i;
            while (index > 0 && current < array[index - 1]) {
                array[index] = array[index - 1];
                index--;
            }
            array[index] = current;
        }
    }
}